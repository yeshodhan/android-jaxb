# XML Schema (XSD) to Simple XML Annotated Java (Android JAXB)
##Library to convert XML Schema to SimpleXML annotated Java classes for Android

Library works to convert simple XSD files without inheritance and multiple namespaces to SimpleXML annotated Java classes. This solves my current requirement.

### Usage

//TODO

### Example

#### XML Schema  

```xml
<?xml version="1.0" encoding="UTF-8"?>
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns="http://person.mickoo.com/"
            targetNamespace="http://person.mickoo.com/" elementFormDefault="qualified">

    <xsd:element name="Person" type="Person"/>

    <xsd:complexType name="Person">
        <xsd:sequence>
            <xsd:element name="FirstName" type="xsd:string" minOccurs="0" />
            <xsd:element name="LastName" type="xsd:string" minOccurs="0" />
            <xsd:element name="Adult" type="xsd:boolean" minOccurs="0" />
            <xsd:element name="Addresses" type="Addresses" minOccurs="0" />
            <xsd:element name="Gender" type="Gender" minOccurs="0" />
            <xsd:element name="Favorite_Fruits" type="Fruits" minOccurs="0" maxOccurs="3"/>
            <xsd:element name="SomeThing_really_whacky-by-the-user" type="xsd:string" minOccurs="0" />
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="Addresses">
        <xsd:sequence>
            <xsd:element name="Address" type="Address" minOccurs="0" maxOccurs="unbounded"/>
        </xsd:sequence>
    </xsd:complexType>

    <xsd:complexType name="Address">
        <xsd:sequence>
            <xsd:element name="Line1" type="xsd:string" minOccurs="0" />
            <xsd:element name="Line2" type="xsd:string" minOccurs="0" />
            <xsd:element name="City" type="xsd:string" minOccurs="0" />
            <xsd:element name="State" type="xsd:string" minOccurs="0" />
            <xsd:element name="Country" type="xsd:string" minOccurs="1" />
            <xsd:element name="PostalCode" type="xsd:string" minOccurs="0" />
        </xsd:sequence>
    </xsd:complexType>

    <xsd:simpleType name="Gender">
        <xsd:restriction base="xsd:string">
            <xsd:enumeration value="MALE"/>
            <xsd:enumeration value="FEMALE"/>
            <xsd:enumeration value="NOT_SPECIFIED"/>
        </xsd:restriction>
    </xsd:simpleType>

    <xsd:simpleType name="Fruits">
        <xsd:restriction base="xsd:string">
            <xsd:enumeration value="Apple"/>
            <xsd:enumeration value="Banana"/>
            <xsd:enumeration value="Mango"/>
            <xsd:enumeration value="Orange"/>
            <xsd:enumeration value="Grapes"/>
            <xsd:enumeration value="Watermelon"/>
            <xsd:enumeration value="Peach"/>
            <xsd:enumeration value="Apricot"/>
            <xsd:enumeration value="Grapefruit"/>
        </xsd:restriction>
    </xsd:simpleType>

</xsd:schema>

```
#### Generated Java Classes

```java



package com.mickoo.person;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Address<br>
 * Generated using: xsd-to-simplexml generator.<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Address")
@Namespace(reference = "http://person.mickoo.com/")
public class Address {

    @Element(name = "Line1", required = false)
    private String line1;
    @Element(name = "Line2", required = false)
    private String line2;
    @Element(name = "City", required = false)
    private String city;
    @Element(name = "State", required = false)
    private String state;
    @Element(name = "Country", required = true)
    private String country;
    @Element(name = "PostalCode", required = false)
    private String postalCode;

    public Address() {
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}

package com.mickoo.person;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Addresses<br>
 * Generated using: xsd-to-simplexml generator.<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Addresses")
@Namespace(reference = "http://person.mickoo.com/")
public class Addresses {

    @ElementList(name = "Address", entry = "Address", inline = true, required = false)
    private List<Address> address;

    public Addresses() {
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

}

package com.mickoo.person;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "Fruits")
@Namespace(reference = "http://person.mickoo.com/")
public enum Fruits {

    Apple,
    Banana,
    Mango,
    Orange,
    Grapes,
    Watermelon,
    Peach,
    Apricot,
    Grapefruit;

}

package com.mickoo.person;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "Gender")
@Namespace(reference = "http://person.mickoo.com/")
public enum Gender {

    MALE,
    FEMALE,
    NOT_SPECIFIED;

}

package com.mickoo.person;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
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
    @Element(name = "Gender", required = false)
    private Gender gender;
    @ElementList(name = "Favorite_Fruits", entry = "Favorite_Fruits", inline = true, required = false)
    private List<Fruits> favoriteFruits;
    @Element(name = "SomeThing_really_whacky-by-the-user", required = false)
    private String someThingReallyWhackyByTheUser;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
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

}



```

#### Serialized XML

##### Sample Code to serialize XML from generated Java Classes

```java
        Serializer serializer = new Persister();
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAdult(true);

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
```
##### XML Output

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Person xmlns="http://person.mickoo.com/">
   <FirstName>John</FirstName>
   <LastName>Doe</LastName>
   <Adult>true</Adult>
   <Addresses>
      <Address>
         <Line1>1 Main Street</Line1>
         <Line2>Apt 12</Line2>
         <City>San Jose</City>
         <State>California</State>
         <Country>United States</Country>
      </Address>
      <Address>
         <Line1>2 Main Street</Line1>
         <Line2>Apt 14</Line2>
         <City>San Jose</City>
         <State>California</State>
         <Country>United States</Country>
      </Address>
   </Addresses>
   <Gender>MALE</Gender>
   <Favorite_Fruits>Apple</Favorite_Fruits>
   <Favorite_Fruits>Mango</Favorite_Fruits>
   <SomeThing_really_whacky-by-the-user>Whacky shit!</SomeThing_really_whacky-by-the-user>
</Person>
```


## Terms of Use
Feel free to fork and modify the code as per your needs. I do not take responsibility for any damage caused by the use this library. ;)  
Drop a note to yeshodhan.kulkarni@gmail.com or raise an issue if anyone needs support for more complex schemas.
