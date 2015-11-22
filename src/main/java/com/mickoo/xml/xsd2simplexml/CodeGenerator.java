package com.mickoo.xml.xsd2simplexml;

import com.mickoo.xml.xsd2simplexml.bindings.EnumAttribute;
import com.mickoo.xml.xsd2simplexml.bindings.EnumAttributeValue;
import com.mickoo.xml.xsd2simplexml.bindings.EnumBinding;
import com.sun.codemodel.*;
import org.apache.log4j.Logger;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Code Generator
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class CodeGenerator {

    Logger logger = Logger.getLogger(CodeGenerator.class);

    JCodeModel codeModel;
    Map<String, GeneratedClass> generatedClasses = new HashMap<String, GeneratedClass>();
    File destinationDir;
    String targetPackage;
    Map<String, String> bindingRedirects = new HashMap<String, String>();

    public CodeGenerator(File destinationDir, String targetPackage) {
        this.codeModel = new JCodeModel();
        this.destinationDir = destinationDir;
        this.targetPackage = targetPackage;
        logger.info("Code Generator Initialized. Destination Directory: " + destinationDir);
    }

    public GeneratedClass createElement(String namespace, String name) throws JClassAlreadyExistsException {
        String className = NameConverter.smart.toClassName(name);
        String qualifiedClassName = targetPackage + "." + NameConverter.smart.toClassName(className);
        GeneratedClass generatedClass = generatedClasses.get(qualifiedClassName);
        if (generatedClass != null) {
            return generatedClass;
        }
        JDefinedClass jDefinedClass = codeModel._class(qualifiedClassName);
        generatedClass = new GeneratedClass(codeModel, jDefinedClass);
        jDefinedClass.annotate(Root.class).param("name", name);
        jDefinedClass.annotate(Namespace.class).param("reference", namespace);
        jDefinedClass.constructor(JMod.PUBLIC);

        JDocComment jDocComment = jDefinedClass.javadoc();
        jDocComment.add(className);
        jDocComment.add("<br>\n");
        jDocComment.add("Generated using Android JAXB");
        jDocComment.add("<br>\n");
        jDocComment.add("@link https://github.com/yeshodhan/android-jaxb");

        generatedClasses.put(qualifiedClassName, generatedClass);
        return generatedClass;
    }

    public GeneratedClass createEnum(String namespace, String name, List<String> values, EnumBinding enumBinding) throws JClassAlreadyExistsException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String className = NameConverter.smart.toClassName(name);
        if (enumBinding != null && !Utils.isEmpty(enumBinding.getClassName())) {
            bindingRedirects.put(targetPackage + "." + className, targetPackage + "." + enumBinding.getClassName());
            className = enumBinding.getClassName();
        }

        String qualifiedClassName = targetPackage + "." + className;
        GeneratedClass generatedClass = generatedClasses.get(qualifiedClassName);
        if (generatedClass != null) {
            return generatedClass;
        }

        JDefinedClass enumClass = codeModel._class(JMod.PUBLIC, qualifiedClassName, ClassType.ENUM);
        generatedClass = new GeneratedClass(codeModel, enumClass);
        enumClass.annotate(Root.class).param("name", name);
        enumClass.annotate(Namespace.class).param("reference", namespace);


        if (enumBinding == null) {

            // create enumeration without any customization

            for (String enumConstant : values) {
                enumClass.enumConstant(enumConstant);
            }
        } else {

            // create enumeration with the bindings provided

            JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);

            for (EnumAttribute enumAttribute : enumBinding.getAttributes()) {

                //constructor
                enumConstructor.param(enumAttribute.getTypeClz(), enumAttribute.getName());
                enumConstructor.body().assign(JExpr._this().ref(enumAttribute.getName()), JExpr.ref(enumAttribute.getName()));

                //property
                JFieldVar attributeVar = enumClass.field(JMod.PRIVATE | JMod.FINAL, enumAttribute.getTypeClz(), enumAttribute.getName());

                //getter
                JMethod attributeMethod = enumClass.method(JMod.PUBLIC, enumAttribute.getTypeClz(), enumAttribute.getName());
                attributeMethod.body()._return(attributeVar);
            }

            for (EnumAttributeValue attributeValue : enumBinding.getAttributeValues()) {

                JEnumConstant enumConstant = enumClass.enumConstant(attributeValue.getKey());
                List<Object> attributeValues = attributeValue.getAttributes();
                int index = 0;
                for (Object attributeVal : attributeValues) {
                    EnumAttribute enumAttribute = enumBinding.getAttributes().get(index);

                    //todo - need to find a better way.
                    if (enumAttribute.getTypeClz() == String.class) {

                        enumConstant.arg(JExpr.lit((String) attributeVal));

                    } else if (enumAttribute.getTypeClz() == Integer.class) {

                        enumConstant.arg(JExpr.lit((Integer) attributeVal));

                    } else if (enumAttribute.getTypeClz() == Float.class) {

                        enumConstant.arg(JExpr.lit((Float) attributeVal));

                    } else if (enumAttribute.getTypeClz() == Double.class) {

                        enumConstant.arg(JExpr.lit((Double) attributeVal));

                    } else if (enumAttribute.getTypeClz() == Short.class) {

                        enumConstant.arg(JExpr.lit((Short) attributeVal));

                    } else if (enumAttribute.getTypeClz() == Boolean.class) {

                        enumConstant.arg(JExpr.lit((Boolean) attributeVal));

                    } else if (enumAttribute.getTypeClz() == Character.class) {

                        enumConstant.arg(JExpr.lit((Character) attributeVal));

                    }

                    index++;
                }
            }
        }

        generatedClasses.put(qualifiedClassName, generatedClass);
        return generatedClass;

    }

    public void writeClasses() throws IOException {
        codeModel.build(destinationDir);
    }

    public JType jtype(Class clz) {
        return codeModel.ref(clz);
    }

}
