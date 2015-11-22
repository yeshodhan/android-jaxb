package com.mickoo.xml.xml2simplexml;

import com.mickoo.person.*;
import com.mickoo.xml.xsd2simplexml.SchemaParser;
import org.junit.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * com.mickoo.xml.xml2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
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
        person.setAdult(true);

        person.setGender(GenderEnum.MALE);

        List<Fruits> fruits = new ArrayList<Fruits>();
        fruits.add(Fruits.Apple);
        fruits.add(Fruits.Mango);
        person.setFavoriteFruits(fruits);

        person.setSomeThingReallyWhackyByTheUser("Whacky shit!");

        Addresses addresses = new Addresses();
        person.setAddresses(addresses);

        List<Address> addressList = new ArrayList<Address>();
        addresses.setAddress(addressList);

        Address address = new Address();
        addressList.add(address);
        address.setLine1("1 Main Street");
        address.setLine2("Apt 12");
        address.setCity("San Jose");
        address.setState("California");
        address.setCountry("United States");

        address = new Address();
        addressList.add(address);
        address.setLine1("2 Main Street");
        address.setLine2("Apt 14");
        address.setCity("San Jose");
        address.setState("California");
        address.setCountry("United States");

        File result = new File(TEST_RESOURCES_DIR+"/person.xml");
        serializer.write(person, result);
    }

    public void parser() throws Exception {
        String schemaFileName = "person.xsd";
        File schemaFile = new File(TEST_RESOURCES_DIR + "/" + schemaFileName);
        File bindingsFile = new File(TEST_RESOURCES_DIR + "/bindings.json" );
        SchemaParser schemaParser = new SchemaParser(schemaFile, DESTINATION_DIR, "com.mickoo.person", bindingsFile);

//        File file = new File("/Users/yeshodhan/projects/tpra/iot-java-sdk-git/rangeextender/src/main/java/com/tplinkra/rangeextender/re350k/xml/rangeextender-api.xsd");
//        SchemaParser schemaParser = new SchemaParser(file, DESTINATION_DIR, "com.tplinkra.rangeextender.re350k.xml");

        schemaParser.parse();
    }

    @Test
    public void test() throws Exception {
//        parser();
        serialize();
    }

}
