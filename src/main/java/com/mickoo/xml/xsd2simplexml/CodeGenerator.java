package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.*;
import com.sun.xml.internal.bind.api.impl.NameConverter;
import org.apache.log4j.Logger;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Code Generator
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class CodeGenerator {

    Logger logger = Logger.getLogger(CodeGenerator.class);

    JCodeModel codeModel;
    Map<String, GeneratedClass> generatedClasses = new HashMap<String, GeneratedClass>();
    String destinationDir;
    String targetPackage;

    public CodeGenerator(String destinationDir, String targetPackage) {
        this.codeModel = new JCodeModel();
        this.destinationDir = destinationDir;
        this.targetPackage = targetPackage;
        logger.info("Code Generator Initialized. Destination Directory: " + destinationDir);
    }

    public GeneratedClass createElement(String namespace, String name) throws JClassAlreadyExistsException {
        String className = NameConverter.smart.toClassName(name);
        String qualifiedClassName = targetPackage + "." + NameConverter.smart.toClassName(className);
        GeneratedClass generatedClass = generatedClasses.get(qualifiedClassName);
        if(generatedClass != null) {
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
        jDocComment.add("Generated using: xsd-to-simplexml generator.");
        jDocComment.add("<br>\n");
        jDocComment.add("@link https://github.com/yeshodhan/android-jaxb");

        generatedClasses.put(qualifiedClassName, generatedClass);
        return generatedClass;
    }

    public GeneratedClass createEnum(String namespace, String name, List<String> values) throws JClassAlreadyExistsException {
        String className = NameConverter.smart.toClassName(name);
        String qualifiedClassName = targetPackage + "." + NameConverter.smart.toClassName(className);
        GeneratedClass generatedClass = generatedClasses.get(qualifiedClassName);
        if(generatedClass != null) {
            return generatedClass;
        }

        JDefinedClass enumClass = codeModel._class(JMod.PUBLIC, qualifiedClassName, ClassType.ENUM);
        generatedClass = new GeneratedClass(codeModel, enumClass);
        enumClass.annotate(Root.class).param("name", name);
        enumClass.annotate(Namespace.class).param("reference", namespace);
        for(String enumConstant : values) {
            JEnumConstant enumConst = enumClass.enumConstant(enumConstant);
        }
        generatedClasses.put(qualifiedClassName, generatedClass);
        return generatedClass;


//        JFieldVar columnField = enumClass.field(JMod.PRIVATE|JMod.FINAL, String.class, "column");
//        JFieldVar filterableField = enumClass.field(JMod.PRIVATE | JMod.FINAL, codeModel.BOOLEAN, "filterable");
//
//        JMethod enumConstructor = enumClass.constructor(JMod.PRIVATE);
//        enumConstructor.param(String.class, "column");
//        enumConstructor.param(codeModel.BOOLEAN, "filterable");
//        enumConstructor.body().assign(JExpr._this().ref ("column"), JExpr.ref("column"));
//        enumConstructor.body().assign(JExpr._this().ref ("filterable"), JExpr.ref("filterable"));
//
//        JMethod getterColumnMethod = enumClass.method(JMod.PUBLIC, String.class, "getColumn");
//        getterColumnMethod.body()._return(columnField);
//        JMethod getterFilterMethod = enumClass.method(JMod.PUBLIC, codeModel.BOOLEAN, "isFilterable");
//        getterFilterMethod.body()._return(filterableField);
//
//        JEnumConstant enumConst = enumClass.enumConstant("FOO_BAR");
//        enumConst.arg(JExpr.lit("fooBar"));
//        enumConst.arg(JExpr.lit(true));

    }

    public void writeClasses() throws IOException {
        File destination = new File(destinationDir);
        destination.mkdirs();
        codeModel.build(destination);
    }

    public JType jtype(Class clz) {
        return codeModel.ref(clz);
    }

}
