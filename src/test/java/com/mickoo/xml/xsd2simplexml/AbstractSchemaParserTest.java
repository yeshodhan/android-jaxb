package com.mickoo.xml.xsd2simplexml;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * A base class for testing the SchemaParser on xsd file instances
 */
public abstract class AbstractSchemaParserTest {

    private static final String TEMP_DIRECTORY_NAME_PREFIX = "conversionResults";

    /**
     * TO BE SET by subclasses
     */
    String resourceXsdFilePath;
    /**
     * TO BE SET by subclasses
     */
    String bindingsJsonFilePath;
    /**
     * TO BE SET by subclasses
     */
    String packageName;
    SchemaParser schemaParser;

    /**
     * Loaded from resourceXsdFilePath
     */
    File xmlSchema;
    /**
     * Temporary directory
     */
    File destinationDir;
    /**
     * Loaded from bindingsJsonFilePath
     */
    File bindingsFile;

    /**
     * Calculated through packageName
     */
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

    @Test
    public void verifyCreatedJavaFiles() {
        try {
            schemaParser = new SchemaParser(xmlSchema, destinationDir, packageName, bindingsFile);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Error constructing SchemaParser");
        }
        try {
            schemaParser.parse();
            final URL personFolder = getClass().getClassLoader().getResource(expectedResultsFolder);
            assertNotNull("Cannot load resources \"" + expectedResultsFolder + "\" folder where there should be comparison files", personFolder);

            final List<File> createdFiles = Files.list(
                    Paths.get(destinationDir.toString(), expectedResultsFolder))
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            final List<File> toCompareFiles = Files.list(Paths.get(personFolder.toURI()))
                    .map(Path::toFile)
                    .filter(file -> file.getName().endsWith(".java"))
                    .collect(Collectors.toList());

            // check all files equals to samples provided
            for (int i = 0; i < createdFiles.size(); i++) {
                final String actualString = FileUtils.readFileToString(createdFiles.get(i));
                final String expectedString = FileUtils.readFileToString(toCompareFiles.get(i));

                assertEquals("A produced file is not as expected -> " + createdFiles.get(i), expectedString, actualString);
            }
        } catch (Exception e) {
            e.printStackTrace();
            fail("Error calling parse()");
        }
    }
}
