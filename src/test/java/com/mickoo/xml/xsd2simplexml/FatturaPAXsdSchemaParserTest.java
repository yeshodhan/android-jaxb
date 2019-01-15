package com.mickoo.xml.xsd2simplexml;

/**
 * A test class for SchemaParser run on FatturaPA xsd file
 */
public class FatturaPAXsdSchemaParserTest extends AbstractSchemaParserTest {

    @Override
    public void setUp() throws Exception {
        resourceXsdFilePath = "FatturaPA_1.2.1.xsd";
        bindingsJsonFilePath = null;

        packageName = "com.fatturapa";

        super.setUp(); // load files
    }
}
