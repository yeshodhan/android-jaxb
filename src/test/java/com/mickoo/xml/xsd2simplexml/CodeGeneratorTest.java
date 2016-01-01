package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.JClassAlreadyExistsException;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * com.mickoo.xml.xml2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */

public class CodeGeneratorTest {

    Logger logger = Logger.getLogger(CodeGeneratorTest.class);

    String DESTINATION_DIR = System.getProperty("user.dir") + "/src/test/java";
    CodeGenerator codeGenerator = new CodeGenerator(new File(DESTINATION_DIR), "com.mickoo.person");

    @Test
    public void createClass() throws IOException, JClassAlreadyExistsException {

        String className = "Person";
        String namespace = "http://person.mickoo.com/";

        GeneratedClass generatedClass = codeGenerator.createElement(namespace, className);
        generatedClass.addElement(codeGenerator.jtype(String.class), "FirstName", 0, false, ElementType.ELEMENT);
        generatedClass.addElement(codeGenerator.jtype(String.class), "LastName", 0, false, ElementType.ELEMENT);
        generatedClass.addElement(codeGenerator.jtype(String.class), "Is_Adult", 0, false, ElementType.ELEMENT);
        generatedClass.addElement(codeGenerator.jtype(String.class), "Country_Of_Birth", 0, false, ElementType.ELEMENT);

        codeGenerator.writeClasses();

    }

}
