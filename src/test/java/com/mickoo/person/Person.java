
package com.mickoo.person;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Person<br>
 * Generated using Android JAXB<br>
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
    @Element(name = "Gender", required = false)
    private GenderEnum gender;
    @ElementList(name = "Favorite_Fruits", entry = "Favorite_Fruits", inline = true, required = false)
    private List<Fruits> favoriteFruits;
    @Element(name = "SomeThing_really_whacky-by-the-user", required = false)
    private String someThingReallyWhackyByTheUser;
    @Element(name = "Pets", required = false)
    private Pets pets;
    @ElementList(name = "Phone", entry = "Phone", inline = true, required = false)
    private List<Phone> phone;
    @Attribute(name = "id", required = false)
    private String id;

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

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public List<Fruits> getFavoriteFruits() {
        return favoriteFruits;
    }

    public void setFavoriteFruits(List<Fruits> favoriteFruits) {
        this.favoriteFruits = favoriteFruits;
    }

    public String getSomeThingReallyWhackyByTheUser() {
        return someThingReallyWhackyByTheUser;
    }

    public void setSomeThingReallyWhackyByTheUser(String someThingReallyWhackyByTheUser) {
        this.someThingReallyWhackyByTheUser = someThingReallyWhackyByTheUser;
    }

    public Pets getPets() {
        return pets;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
