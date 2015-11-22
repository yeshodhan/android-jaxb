package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMod;
import com.sun.xml.bind.api.impl.NameConverter;
import org.apache.log4j.Logger;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


/**
 * com.mickoo.xml.xsd2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class CodeGenerator {

    Logger logger = Logger.getLogger(CodeGenerator.class);


    JCodeModel codeModel;
    Set<String> generatedClasses = new HashSet<String>();
    String destinationDir;
    String targetPackage;

    public CodeGenerator(String destinationDir, String targetPackage) {
        this.codeModel = new JCodeModel();
        this.destinationDir = destinationDir;
        this.targetPackage = targetPackage;
        logger.info("Code Generator Initialized. Destination Directory: " + destinationDir);
    }

    public GeneratedClass createRootElement(String namespace, String name) throws JClassAlreadyExistsException {
        String className = targetPackage + "." + NameConverter.smart.toClassName(name);
        JDefinedClass jDefinedClass = codeModel._class(className);
        GeneratedClass generatedClass = new GeneratedClass(codeModel, jDefinedClass);
        jDefinedClass.annotate(Root.class).param("name", name);
        jDefinedClass.annotate(Namespace.class).param("reference", namespace);
        jDefinedClass.constructor(JMod.PUBLIC);
        generatedClasses.add(className);
        return generatedClass;
    }

    public void writeClasses() throws IOException {
        File destination = new File(destinationDir);
        destination.mkdirs();
        codeModel.build(destination);
    }

}
