package com.mickoo.xml.xml2simplexml;

import com.mickoo.person.Person;
import com.mickoo.xml.xsd2simplexml.SchemaParser;
import org.junit.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;

/**
 * com.mickoo.xml.xml2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class MainTest {

    private final String DESTINATION_DIR = System.getProperty("user.dir") + "/target/generated";
    private final String TEST_RESOURCES_DIR = System.getProperty("user.dir") + "/src/test/resources";

    public void serialize() throws Exception {
        Serializer serializer = new Persister();
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setIsAdult(true);
//        person.setCountryOfBirth("United States");
        File result = new File(TEST_RESOURCES_DIR+"/person.xml");
        serializer.write(person, result);
    }

    public void parser() throws Exception {
        String schemaFile = "person.xsd";
        File file = new File(TEST_RESOURCES_DIR + "/" + schemaFile);
        SchemaParser schemaParser = new SchemaParser(file, DESTINATION_DIR, "com.mickoo.person");

//        File file = new File("/Users/yeshodhan/projects/tpra/iot-java-sdk-git/rangeextender/src/main/java/com/tplinkra/rangeextender/re350k/xml/rangeextender-api.xsd");
//        SchemaParser schemaParser = new SchemaParser(file, DESTINATION_DIR, "com.tplinkra.rangeextender.re350k.xml");

        schemaParser.parse();
    }

    @Test
    public void test() throws Exception {
        parser();
    }

}
