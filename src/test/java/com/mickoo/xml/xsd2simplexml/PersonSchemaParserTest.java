package com.mickoo.xml.xsd2simplexml;

/**
 * A test class for SchemaParser that parses person.xsd with its bindings.json
 */
public class PersonSchemaParserTest extends AbstractSchemaParserTest {

    @Override
    public void setUp() throws Exception {
        packageName = "com.mickoo.person";

        resourceXsdFilePath = "person.xsd";
        bindingsJsonFilePath = "bindings.json";

        super.setUp(); // load files
    }
}