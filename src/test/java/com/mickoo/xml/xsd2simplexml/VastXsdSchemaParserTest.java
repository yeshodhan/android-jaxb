package com.mickoo.xml.xsd2simplexml;

/**
 * A test class that test SchemaParserParsing Vast xsd schema
 */
public class VastXsdSchemaParserTest extends AbstractSchemaParserTest {

    @Override
    public void setUp() throws Exception {
        resourceXsdFilePath = "vast_2.0.1.xsd";
        bindingsJsonFilePath = null;
        packageName = "com.vast";

        super.setUp();
    }
}
