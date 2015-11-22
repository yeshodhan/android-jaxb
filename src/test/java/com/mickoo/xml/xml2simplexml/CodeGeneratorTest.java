package com.mickoo.xml.xml2simplexml;

import com.mickoo.xml.xsd2simplexml.CodeGenerator;
import com.mickoo.xml.xsd2simplexml.GeneratedClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JMod;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

/**
 * com.mickoo.xml.xml2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */

public class CodeGeneratorTest {

    Logger logger = Logger.getLogger(CodeGeneratorTest.class);

    String destinationDir = System.getProperty("user.dir") + "/src/test/java";
    CodeGenerator codeGenerator = new CodeGenerator(destinationDir, "com.mickoo.person");

    @Test
    public void createClass() throws IOException, JClassAlreadyExistsException {

        String className = "Person";
        String namespace = "http://person.mickoo.com/";

        GeneratedClass generatedClass = codeGenerator.createRootElement(namespace, className);
        generatedClass.addElement(JMod.PUBLIC, String.class, "FirstName", 0, false, false);
        generatedClass.addElement(JMod.PUBLIC, String.class, "LastName", 0, false, false);
        generatedClass.addElement(JMod.PUBLIC, Boolean.class, "Is_Adult", 0, false, false);
        generatedClass.addElement(JMod.PUBLIC, String.class, "Country_Of_Birth", 0, false, false);

        codeGenerator.writeClasses();

    }

}
