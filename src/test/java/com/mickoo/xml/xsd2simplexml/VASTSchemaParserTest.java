package com.mickoo.xml.xsd2simplexml;


import org.junit.Test;

import java.io.File;


/**
 * com.mickoo.xml.xml2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class VASTSchemaParserTest {

    private final String DESTINATION_DIR = System.getProperty("user.dir") + "/src/test/java";
    private final String TEST_RESOURCES_DIR = System.getProperty("user.dir") + "/src/test/resources";

    public void parser() throws Exception {
        String schemaFileName = "vast_2.0.1.xsd";
        File destinationDir = new File(DESTINATION_DIR);
        File schemaFile = new File(TEST_RESOURCES_DIR + "/" + schemaFileName);
        SchemaParser schemaParser = new SchemaParser(schemaFile, destinationDir, "com.vast", null);
        schemaParser.parse();
    }

    @Test
    public void test() throws Exception {
        parser();
//        serialize();
    }

}
