package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JType;
import com.sun.xml.internal.bind.api.impl.NameConverter;
import com.sun.xml.internal.xsom.*;
import com.sun.xml.internal.xsom.parser.JAXPParser;
import com.sun.xml.internal.xsom.parser.XMLParser;
import com.sun.xml.internal.xsom.parser.XSOMParser;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Vector;

/**
 * Schema Parser
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class SchemaParser {

    Logger logger = Logger.getLogger(SchemaParser.class);

    CodeGenerator codeGenerator;
    String destinationDir;
    String targetPackage;
    XSSchema schema;

    public SchemaParser(File file, String destinationDir, String targetPackage) throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();
        XMLParser xmlParser = new JAXPParser();
        XSOMParser parser = new XSOMParser(xmlParser);
        parser.parse(file);
        for (XSSchema schema : parser.getResult().getSchemas()) {
            if (schema.getElementDecls().size() > 0) {
                this.schema = schema;
                break;
            }
        }

        this.destinationDir = destinationDir;
        this.targetPackage = targetPackage;
        this.codeGenerator = new CodeGenerator(destinationDir, targetPackage);
    }

    public void parse() throws Exception {
        for (XSElementDecl element : schema.getElementDecls().values()) {
            ParseContext parseContext = new ParseContext();
            processElement(element, parseContext);
        }
        codeGenerator.writeClasses();
    }

    public JType getJType(JCodeModel codeModel, String type) {
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

    public static class ParseContext {
        GeneratedClass currentClass;
        Integer minOccurs;
        Integer maxOccurs;
        String path = "";
        String type;
        String indent = "";

        public String getOccurs() {
            return " Min Occurs: " + minOccurs + ", Max Occurs: " + maxOccurs + " ";
        }

    }

    public static class SimpleTypeRestriction {
        public String[] enumeration = null;
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

    private void initRestrictions(XSSimpleType xsSimpleType, SimpleTypeRestriction simpleTypeRestriction) {
        XSRestrictionSimpleType restriction = xsSimpleType.asRestriction();
        if (restriction != null) {
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
                simpleTypeRestriction.enumeration = enumeration.toArray(new String[]{});
            }
            if (pattern.size() > 0) {
                simpleTypeRestriction.pattern = pattern.toArray(new String[]{});
            }
        }
    }

    private void processParticle(XSParticle particle, ParseContext parseContext)  throws Exception{
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

    private void processGroup(XSModelGroup modelGroup, ParseContext parseContext)  throws Exception{
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

    private void processGroupDecl(XSModelGroupDecl modelGroupDecl, ParseContext parseContext)  throws Exception{
        logger.info(parseContext.indent + "[Group " + modelGroupDecl.getName() + parseContext.getOccurs() + "]");
        processGroup(modelGroupDecl.getModelGroup(), parseContext);
    }

    private void processComplexType(XSComplexType complexType, ParseContext parseContext)  throws Exception{
        XSParticle particle = complexType.getContentType().asParticle();
        if (particle != null) {
            processParticle(particle, parseContext);
        }
    }

    private void processSimpleType(XSSimpleType simpleType, ParseContext parseContext)  throws Exception {
        SimpleTypeRestriction restriction = new SimpleTypeRestriction();
        initRestrictions(simpleType, restriction);
        logger.info(restriction.toString());
    }

    private void processElement(XSElementDecl element, ParseContext parseContext) throws Exception{
        parseContext.path += "/" + element.getName();
        System.out.print(parseContext.indent + "[Element " + parseContext.path + "   " + parseContext.getOccurs() + "] of type [" + element.getType().getName() + "]");
        if (element.getType().isComplexType()) {
            GeneratedClass parentClass = parseContext.currentClass;
            parseContext.currentClass = codeGenerator.createElement(element.getTargetNamespace(), element.getName());
            if(parentClass != null) {
                parentClass.addElement(parseContext.currentClass.codeModel.parseType(NameConverter.smart.toClassName(element.getName())), element.getName(), parseContext.minOccurs, parseContext.maxOccurs == -1, false);
            }
            processComplexType(element.getType().asComplexType(), parseContext);
        } else {
            processSimpleType(element.getType().asSimpleType(), parseContext);
            parseContext.currentClass.addElement(getJType(parseContext.currentClass.codeModel, element.getType().getName()), element.getName(), parseContext.minOccurs, parseContext.maxOccurs == -1, false);
        }
    }

}
