package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.*;
import com.sun.xml.internal.bind.api.impl.NameConverter;
import org.apache.log4j.Logger;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
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
        jDocComment.add("{@link https://github.com/yeshodhan/xsd-to-simplexml}");

        generatedClasses.put(qualifiedClassName, generatedClass);
        return generatedClass;
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
