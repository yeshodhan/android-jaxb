package com.mickoo.xml.xsd2simplexml;

import com.mickoo.xml.xsd2simplexml.bindings.Bindings;
import com.mickoo.xml.xsd2simplexml.bindings.EnumBinding;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JType;
import com.sun.xml.xsom.*;
import com.sun.xml.xsom.parser.JAXPParser;
import com.sun.xml.xsom.parser.XMLParser;
import com.sun.xml.xsom.parser.XSOMParser;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.*;

/**
 * Schema Parser
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class SchemaParser {

    private static final Logger logger = Logger.getLogger(SchemaParser.class);

    private CodeGenerator codeGenerator;
    private XSSchema schema;
    private Bindings bindings;

    private long startTime = 0;


    public SchemaParser(File xmlSchema, File destinationDir, String targetPackage, File schemaBindings) throws Exception {

        startTime = System.currentTimeMillis();

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlSchema);
        doc.getDocumentElement().normalize();
        XMLParser xmlParser = new JAXPParser();
        XSOMParser parser = new XSOMParser(xmlParser);
        parser.parse(xmlSchema);

        for (XSSchema schema : parser.getResult().getSchemas()) {
            if (schema.getElementDecls().size() > 0) {
                this.schema = schema;
                break;
            }
        }

        bindings = new Bindings();
        if (schemaBindings != null) {
            bindings.readBindings(schemaBindings);
        }

        this.codeGenerator = new CodeGenerator(destinationDir, targetPackage);
    }

    public void parse() throws Exception {
        for (XSElementDecl element : schema.getElementDecls().values()) {
            ParseContext parseContext = new ParseContext();
            processElement(element, parseContext);
        }
        logger.info("Schema parsing complete.");
        codeGenerator.writeClasses();
        long totalTime = (System.currentTimeMillis() - startTime);
        logger.info("Android JAXB execution complete. Generated " + codeGenerator.generatedClasses.size() + " classes in " + totalTime + " milliseconds.");
        logger.info("Please verify the generated classes for compile errors and syntax issues.");
    }

    protected JType getJType(JCodeModel codeModel, String type) {
        if ("string".equals(type)) {
            return codeModel._ref(String.class);
        } else if ("int".equals(type) || "integer".equals(type) || "byte".equals(type) || "negativeInteger".equals(type) || "nonNegativeInteger".equals(type) || "nonPositiveInteger".equals(type) || "positiveInteger".equals(type) || "short".equals(type) || "unsignedInt".equals(type) || "unsignedShort".equals(type) || "byte".equals("unsignedByte")) {
            return codeModel._ref(Integer.class);
        } else if ("long".equals(type) || "unsignedLong".equals(type)) {
            return codeModel._ref(Long.class);
        } else if ("decimal".equals(type)) {
            return codeModel._ref(Double.class);
        } else if ("boolean".equals(type)) {
            return codeModel._ref(Boolean.class);
        }
        return null;
    }

    static class ParseContext {
        GeneratedClass currentClass;
        Integer minOccurs;
        Integer maxOccurs;
        String path = "";
        String type;
        String indent = "";

        public String getOccurs() {
            return " Min Occurs: " + minOccurs + ", Max Occurs: " + maxOccurs + " ";
        }

        public boolean isUnbounded() {
            return (maxOccurs == -1 || maxOccurs > 1);
        }
    }

    static class SimpleTypeRestriction {
        public List<String> enumeration = null;
        public String maxValue = null;
        public String minValue = null;
        public String length = null;
        public String maxLength = null;
        public String minLength = null;
        public String[] pattern = null;
        public String totalDigits = null;

        public String toString() {
            String enumValues = "";
            if (enumeration != null) {
                for (String val : enumeration) {
                    enumValues += val + ", ";
                }
                enumValues = enumValues.substring(0, enumValues.lastIndexOf(','));
            }

            String patternValues = "";
            if (pattern != null) {
                for (String val : pattern) {
                    patternValues += "(" + val + ")|";
                }
                patternValues = patternValues.substring(0, patternValues.lastIndexOf('|'));
            }
            String retval = "";
            retval += maxValue == null ? "" : "[MaxValue  = " + maxValue + "]\t";
            retval += minValue == null ? "" : "[MinValue  = " + minValue + "]\t";
            retval += maxLength == null ? "" : "[MaxLength = " + maxLength + "]\t";
            retval += minLength == null ? "" : "[MinLength = " + minLength + "]\t";
            retval += pattern == null ? "" : "[Pattern(s) = " + patternValues + "]\t";
            retval += totalDigits == null ? "" : "[TotalDigits = " + totalDigits + "]\t";
            retval += length == null ? "" : "[Length = " + length + "]\t";
            retval += enumeration == null ? "" : "[Values = " + enumValues + "]\t";

            return retval;
        }
    }

    protected  SimpleTypeRestriction getRestrictions(XSSimpleType xsSimpleType) {
        SimpleTypeRestriction simpleTypeRestriction = null;
        XSRestrictionSimpleType restriction = xsSimpleType.asRestriction();
        if (restriction != null) {
            simpleTypeRestriction = new SimpleTypeRestriction();
            Vector<String> enumeration = new Vector<String>();
            Vector<String> pattern = new Vector<String>();

            for (XSFacet facet : restriction.getDeclaredFacets()) {
                if (facet.getName().equals(XSFacet.FACET_ENUMERATION)) {
                    enumeration.add(facet.getValue().value);
                }
                if (facet.getName().equals(XSFacet.FACET_MAXINCLUSIVE)) {
                    simpleTypeRestriction.maxValue = facet.getValue().value;
                }
                if (facet.getName().equals(XSFacet.FACET_MININCLUSIVE)) {
                    simpleTypeRestriction.minValue = facet.getValue().value;
                }
                if (facet.getName().equals(XSFacet.FACET_MAXEXCLUSIVE)) {
                    simpleTypeRestriction.maxValue = String.valueOf(Integer.parseInt(facet.getValue().value) - 1);
                }
                if (facet.getName().equals(XSFacet.FACET_MINEXCLUSIVE)) {
                    simpleTypeRestriction.minValue = String.valueOf(Integer.parseInt(facet.getValue().value) + 1);
                }
                if (facet.getName().equals(XSFacet.FACET_LENGTH)) {
                    simpleTypeRestriction.length = facet.getValue().value;
                }
                if (facet.getName().equals(XSFacet.FACET_MAXLENGTH)) {
                    simpleTypeRestriction.maxLength = facet.getValue().value;
                }
                if (facet.getName().equals(XSFacet.FACET_MINLENGTH)) {
                    simpleTypeRestriction.minLength = facet.getValue().value;
                }
                if (facet.getName().equals(XSFacet.FACET_PATTERN)) {
                    pattern.add(facet.getValue().value);
                }
                if (facet.getName().equals(XSFacet.FACET_TOTALDIGITS)) {
                    simpleTypeRestriction.totalDigits = facet.getValue().value;
                }
            }
            if (enumeration.size() > 0) {
                simpleTypeRestriction.enumeration = new ArrayList<String>();
                simpleTypeRestriction.enumeration.addAll(enumeration);
            }
            if (pattern.size() > 0) {
                simpleTypeRestriction.pattern = pattern.toArray(new String[]{});
            }
        }
        return simpleTypeRestriction;
    }

    protected void processParticle(XSParticle particle, ParseContext parseContext) throws Exception {
        parseContext.minOccurs = particle.getMinOccurs().intValue();
        parseContext.maxOccurs = particle.getMaxOccurs().intValue();
        XSTerm term = particle.getTerm();
        if (term.isModelGroup()) {
            processGroup(term.asModelGroup(), parseContext);
        } else if (term.isModelGroupDecl()) {
            processGroupDecl(term.asModelGroupDecl(), parseContext);
        } else if (term.isElementDecl()) {
            processElement(term.asElementDecl(), parseContext);
        }
    }

    protected void processGroup(XSModelGroup modelGroup, ParseContext parseContext) throws Exception {
        logger.info(parseContext.indent + "[Start of " + modelGroup.getCompositor() + parseContext.getOccurs() + "]");
        for (XSParticle particle : modelGroup.getChildren()) {
            ParseContext newParseContext = new ParseContext();
            newParseContext.indent = parseContext.indent + "\t";
            newParseContext.path = parseContext.path;
            newParseContext.currentClass = parseContext.currentClass;
            processParticle(particle, newParseContext);
        }
        logger.info(parseContext.indent + "[End of " + modelGroup.getCompositor() + "]");
    }

    protected void processGroupDecl(XSModelGroupDecl modelGroupDecl, ParseContext parseContext) throws Exception {
        logger.info(parseContext.indent + "[Group " + modelGroupDecl.getName() + parseContext.getOccurs() + "]");
        processGroup(modelGroupDecl.getModelGroup(), parseContext);
    }

    protected void processComplexType(XSComplexType complexType, ParseContext parseContext) throws Exception {
        XSParticle particle = complexType.getContentType().asParticle();
        if (particle != null) {
            processParticle(particle, parseContext);
        }
        XSSimpleType xsSimpleType = complexType.getContentType().asSimpleType();
        if (xsSimpleType != null) {
        	processText("value", xsSimpleType, parseContext);
        }
        Collection<? extends XSAttributeUse> c = complexType.getAttributeUses();
        Iterator<? extends XSAttributeUse> i = c.iterator();
        while(i.hasNext()) {
            XSAttributeUse attUse = i.next();
            processAttribute(attUse, parseContext);
        }
    }

    private void processAttribute(XSAttributeUse attributeUse, ParseContext parseContext) throws Exception {
        XSAttributeDecl attributeDecl = attributeUse.getDecl();
        XSSimpleType xsSimpleType = attributeDecl.getType();

        ParseContext attributeContext = new ParseContext();

        if (attributeUse.isRequired()){
            attributeContext.minOccurs = 1;
        } else {
            attributeContext.minOccurs = 0;
        }

        attributeContext.currentClass = parseContext.currentClass;
        attributeContext.maxOccurs = 1;
        attributeContext.path = parseContext.path + "/@" + attributeDecl.getName();

        System.out.print(parseContext.indent + "[Attribute " + attributeContext.path + "   " + attributeContext.getOccurs() + "] of type [" + xsSimpleType.getName() + "]");
        addSimpleType(attributeDecl.getName(), xsSimpleType, attributeContext, ElementType.ATTRIBUTE);

    }
    
    private void processText(String name, XSSimpleType xsSimpleType, ParseContext parseContext) throws Exception {

        ParseContext attributeContext = new ParseContext();

        attributeContext.minOccurs = 1;

        attributeContext.currentClass = parseContext.currentClass;
        attributeContext.maxOccurs = 1;
        attributeContext.path = parseContext.path + "/@" + name;

        System.out.print(parseContext.indent + "[Text " + attributeContext.path + "   " + attributeContext.getOccurs() + "] of type [" + xsSimpleType.getName() + "]");
        addSimpleType(name, xsSimpleType, attributeContext, ElementType.TEXT);

    }

    private SimpleTypeRestriction processSimpleType(XSSimpleType simpleType, ParseContext parseContext) throws Exception {
        SimpleTypeRestriction restriction = getRestrictions(simpleType);
        logger.info(restriction.toString());
        return restriction;
    }
    
    private void addSimpleType(String name, XSSimpleType simpleType, ParseContext parseContext, ElementType elementType) throws Exception {
        SimpleTypeRestriction restrictions = processSimpleType(simpleType, parseContext);

        if (restrictions.enumeration == null) {

            //add simple element with primitive property to class

            JType jType = getJType(parseContext.currentClass.codeModel, simpleType.getName());
            if(jType == null && restrictions.pattern != null) {
                jType = parseContext.currentClass.codeModel.ref(String.class);
            }

            parseContext.currentClass.addElement(
                    jType,
                    name,
                    parseContext.minOccurs,
                    parseContext.isUnbounded(),
                    elementType
            );

        } else {

            //create enumeration

            EnumBinding enumBinding = bindings.getEnumBinding(simpleType.getName());

            GeneratedClass enumClass = codeGenerator.createEnum(
                    simpleType.getTargetNamespace(),
                    simpleType.getName(),
                    restrictions.enumeration,
                    enumBinding
            );

            //add enumeration property to class

            String className = NameConverter.smart.toClassName(simpleType.getName());
            if(enumBinding != null && !Utils.isEmpty(enumBinding.getClassName())) className = enumBinding.getClassName();

            parseContext.currentClass.addElement(
                    enumClass.codeModel.parseType(className),
                    name,
                    parseContext.minOccurs,
                    parseContext.isUnbounded(),
                    elementType
            );
        }
    }
    
    

    protected void processElement(XSElementDecl element, ParseContext parseContext) throws Exception {
        parseContext.path += "/" + element.getName();
        System.out.print(parseContext.indent + "[Element " + parseContext.path + "   " + parseContext.getOccurs() + "] of type [" + element.getType().getName() + "]");
        if (element.getType().isComplexType()) {

            GeneratedClass parentClass = parseContext.currentClass;

            if (parentClass != null) {

                parseContext.currentClass = codeGenerator.createElement(
                        element.getTargetNamespace(),
                        element.getType().getName()
                );
                parentClass.addElement(
                        parseContext.currentClass.codeModel.parseType(
                                NameConverter.smart.toClassName(element.getType().getName())
                        ),
                        element.getName(),
                        parseContext.minOccurs,
                        parseContext.isUnbounded(),
                        ElementType.ELEMENT
                );

            } else {

                parseContext.currentClass = codeGenerator.createElement(
                        element.getTargetNamespace(),
                        element.getName()
                );
            }
            processComplexType(element.getType().asComplexType(), parseContext);
            
        } else {
            
            addSimpleType(element.getName(), element.getType().asSimpleType(), parseContext, ElementType.ELEMENT);

        }
    }

}
