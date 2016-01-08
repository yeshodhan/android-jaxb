package com.mickoo.xml.xsd2simplexml;


import com.mickoo.person.*;
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
public class SchemaParserTest {

    private final String DESTINATION_DIR = System.getProperty("user.dir") + "/src/test/java";
    private final String TEST_RESOURCES_DIR = System.getProperty("user.dir") + "/src/test/resources";

    public void serialize() throws Exception {
        Serializer serializer = new Persister();
        Person person = new Person();

        person.setId("1001");
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
        
        Pets pets = new Pets();
        person.setPets(pets);
        
        List<Pet> petList = new ArrayList<Pet>();
        pets.setPet(petList);
        
        Pet pet = new Pet();
        petList.add(pet);
        pet.setType("Cat");
        pet.setValue("Garfield");
        
        pet = new Pet();
        petList.add(pet);
        pet.setType("Dog");
        pet.setValue("Oddie");

        pet = new Pet();
        petList.add(pet);
        pet.setType("Fish");
        pet.setValue("Nemo");
        
        List<Phone> phoneList = new ArrayList<Phone>();
        person.setPhone(phoneList);
        
        Phone phone = new Phone ();
        phoneList.add(phone);
        phone.setType("Mobile");
        phone.setValue(800800800);
        
        phone = new Phone ();
        phoneList.add(phone);
        phone.setType("Home");
        phone.setValue(505050505);
        
        File result = new File(TEST_RESOURCES_DIR+"/person.xml");
        serializer.write(person, result);
    }

    public void parser() throws Exception {
        String schemaFileName = "person.xsd";
        File destinationDir = new File(DESTINATION_DIR);
        File schemaFile = new File(TEST_RESOURCES_DIR + "/" + schemaFileName);
        File bindingsFile = new File(TEST_RESOURCES_DIR + "/bindings.json" );
        SchemaParser schemaParser = new SchemaParser(schemaFile, destinationDir, "com.mickoo.person", bindingsFile);
        schemaParser.parse();
    }

    @Test
    public void test() throws Exception {
        parser();
        serialize();
    }

}
