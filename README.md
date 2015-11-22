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
</xsd:schema>

```
#### Generated Java Classes

```java

package com.mickoo.person;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Person<br>
 * Generated using: xsd-to-simplexml generator.<br>
 * {@link https://github.com/yeshodhan/xsd-to-simplexml}
 * 
 */
@Root(name = "Person")
@Namespace(reference = "http://person.mickoo.com/")
public class Person {

    @Element(name = "FirstName", required = false)
    public String firstName;
    @Element(name = "LastName", required = false)
    public String lastName;
    @Element(name = "Adult", required = false)
    public Boolean adult;
    @Element(name = "Addresses", required = true)
    public Addresses addresses;

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


package com.mickoo.person;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Addresses<br>
 * Generated using: xsd-to-simplexml generator.<br>
 * {@link https://github.com/yeshodhan/xsd-to-simplexml}
 * 
 */
@Root(name = "Addresses")
@Namespace(reference = "http://person.mickoo.com/")
public class Addresses {

    @Element(name = "Address", required = true)
    public Address address;

    public Addresses() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}


package com.mickoo.person;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Address<br>
 * Generated using: xsd-to-simplexml generator.<br>
 * {@link https://github.com/yeshodhan/xsd-to-simplexml}
 * 
 */
@Root(name = "Address")
@Namespace(reference = "http://person.mickoo.com/")
public class Address {

    @Element(name = "Line1", required = false)
    public String line1;
    @Element(name = "Line2", required = false)
    public String line2;
    @Element(name = "City", required = false)
    public String city;
    @Element(name = "State", required = false)
    public String state;
    @Element(name = "Country", required = true)
    public String country;
    @Element(name = "PostalCode", required = false)
    public String postalCode;

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

```




Drop a note to yeshodhan.kulkarni@gmail.com or raise an issue if anyone needs support for more complex schemas.
