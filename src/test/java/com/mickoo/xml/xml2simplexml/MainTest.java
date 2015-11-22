package com.mickoo.xml.xml2simplexml;

import com.mickoo.person.Person;
import junit.framework.TestCase;
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
public class MainTest extends TestCase {

    private final String TEST_RESOURCES_DIR = System.getProperty("user.dir") + "/src/test/resources";

    public void test() throws Exception {
        Serializer serializer = new Persister();
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setIsAdult(true);
//        person.setCountryOfBirth("United States");
        File result = new File(TEST_RESOURCES_DIR+"/person.xml");
        serializer.write(person, result);
    }

}
