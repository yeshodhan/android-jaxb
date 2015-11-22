
package com.mickoo.person;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Person<br>
 * Generated using: xsd-to-simplexml generator.<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Person")
@Namespace(reference = "http://person.mickoo.com/")
public class Person {

    @Element(name = "FirstName", required = false)
    private String firstName;
    @Element(name = "LastName", required = false)
    private String lastName;
    @Element(name = "Adult", required = false)
    private Boolean adult;
    @Element(name = "Addresses", required = false)
    private Addresses addresses;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

}
