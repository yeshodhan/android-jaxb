package com.mickoo.xml.xsd2simplexml;

import org.apache.commons.io.FileUtils;
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
public class SchemaParserTest extends AbstractSchemaParserTest {

    @Override
    public void setUp() throws Exception {
        packageName = "com.mickoo.person";

        resourceXsdFilePath = "person.xsd";
        bindingsJsonFilePath = "bindings.json";

        super.setUp(); // load files
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