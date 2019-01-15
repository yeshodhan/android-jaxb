package com.mickoo.xml.xsd2simplexml;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * A base class for testing the SchemaParser on xsd file instances
 */
public abstract class AbstractSchemaParserTest {

    private static final String TEMP_DIRECTORY_NAME_PREFIX = "conversionResults";

    String resourceXsdFilePath;
    String bindingsJsonFilePath;

    SchemaParser schemaParser;

    File xmlSchema;
    File destinationDir;
    String packageName;
    File bindingsFile;

    String expectedResultsFolder;

    @Before
    public void setUp() throws Exception {
        final URL xsdResource = getClass().getClassLoader().getResource(resourceXsdFilePath);
        assertNotNull("Cannot load \"" + resourceXsdFilePath + "\" resource", xsdResource);

        if (StringUtils.isNotBlank(bindingsJsonFilePath)) {
            final URL bindingsResource = getClass().getClassLoader().getResource(bindingsJsonFilePath);
            assertNotNull("Cannot load \"" + bindingsJsonFilePath + "\" resource", bindingsResource);
            bindingsFile = new File(bindingsResource.toURI());
        } else {
            bindingsFile = null;
        }

        xmlSchema = new File(xsdResource.toURI());
        destinationDir = Files.createTempDirectory(TEMP_DIRECTORY_NAME_PREFIX).toFile();

        expectedResultsFolder = packageName.replaceAll("\\.", "\\\\");
    }

    @After
    public void tearDown() throws Exception {
        //noinspection ResultOfMethodCallIgnored
        Files.list(destinationDir.toPath())
                .map(Path::toFile)
                .forEach(File::delete);

        //noinspection ResultOfMethodCallIgnored
        destinationDir.delete();
        schemaParser = null;
    }

    @Test
    public void constructor() {
        try {
            schemaParser = new SchemaParser(xmlSchema, destinationDir, packageName, bindingsFile);
        } catch (Exception e) {
            fail("Error constructing SchemaParser");
        }
    }

    @Test
    public void parse() {
        try {
            schemaParser = new SchemaParser(xmlSchema, destinationDir, packageName, bindingsFile);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Error constructing SchemaParser");
        }
        try {
            schemaParser.parse();
        } catch (Exception e) {
            fail("Error calling parse()");
        }
    }
}
