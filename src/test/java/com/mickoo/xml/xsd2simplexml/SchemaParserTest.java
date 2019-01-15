package com.mickoo.xml.xsd2simplexml;

import org.apache.commons.io.FileUtils;
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
 * A test class for SchemaParser
 */
public class SchemaParserTest {
    private static final String TEMP_DIRECTORY_NAME_PREFIX = "conversionResults";
    private static final String PERSON_EXPECTED_RESULTS_FOLDER = "person";

    private static final String PERSON_RESOURCE = "person.xsd";
    private static final String BINDINGS_JSON = "bindings.json";

    private SchemaParser schemaParser;

    private File xmlSchema;
    private File destinationDir;
    private String packageName;
    private File bindingsFile;

    @Before
    public void setUp() throws Exception {
        final URL personResource = getClass().getClassLoader().getResource(PERSON_RESOURCE);
        assertNotNull("Cannot load \"" + PERSON_RESOURCE + "\" resource", personResource);
        final URL bindingsResource = getClass().getClassLoader().getResource(BINDINGS_JSON);
        assertNotNull("Cannot load \"" + BINDINGS_JSON + "\" resource", bindingsResource);

        xmlSchema = new File(personResource.toURI());
        destinationDir = Files.createTempDirectory(TEMP_DIRECTORY_NAME_PREFIX).toFile();
        packageName = "com.mickoo.person";
        bindingsFile = new File(bindingsResource.toURI());
    }

    @After
    public void tearDown() throws Exception {
        for (final Path path : Files.newDirectoryStream(Paths.get(destinationDir.toURI()))) {
            System.out.println(path.getFileName());

            //noinspection ResultOfMethodCallIgnored
            path.toFile().delete();
        }

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
            final URL personFolder = getClass().getClassLoader().getResource(PERSON_EXPECTED_RESULTS_FOLDER);
            assertNotNull("Cannot load resources \"" + PERSON_EXPECTED_RESULTS_FOLDER + "\" folder where there should be comparison files", personFolder);
            final List<File> createdFiles = Files.list(
                    Paths.get(destinationDir.toString(), packageName.replaceAll("\\.", "\\\\")))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
            final List<File> toCompareFiles = Files.list(Paths.get(personFolder.toURI()))
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            System.out.println(createdFiles);
            System.out.println(toCompareFiles);

            // check all files equals to samples provided
            for (int i = 0; i < createdFiles.size(); i++) {
                final String actualString = FileUtils.readFileToString(createdFiles.get(i));
                final String expectedString = FileUtils.readFileToString(toCompareFiles.get(i));

                assertEquals("The produced files are not equals as those expected", expectedString, actualString);
            }

        } catch (Exception e) {
            e.printStackTrace();
            fail("Error calling parse()");
        }
    }
}