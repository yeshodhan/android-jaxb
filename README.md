# Android JAXB
##Library to generate SimpleXML annotated Java classes  from XML Schema.

Use this library to generate SimpleXML annotated Java classes from simple XSD files without inheritance and multiple namespaces.

### Features

 * Works well with Android
 * Creates JAXB like Class, Property and Method names.
 * Support Enums and Attributes.
 * Customize generated code using a JSON bindings file.

### Motivation  

JAXB is not supported officially on Android. I'm writing a lot of Web Service integration code at this point. I hate using SOAP and XMLSchemas due to all the overheads (coding + network + CPU) involved with XML. 

But since I have no choice at the moment, decided to use JAXB. But then, I realized, my implementation will be used by the Android team and Android does not support JAXB. Googled for a lot of different alternatives, but couldn't find a reliable one.
  
SimpleXML is really light weight and just does the job. There is no JAXB equivalent to SimpleXML out there right now. Hence, Android JAXB.  

It's straight and simple as of now, and does not support multiple XSDs, inheritance and other complex features. I'll add more features in the future to enhance the library. I'm tracking enhancements and new feature using issues.

### Usage

 * Download the Android JAXB executable jar file from : https://s3.amazonaws.com/yeshodhan/android-jaxb-1.0.jar
 * Run > java -jar android-jaxb-1.0.jar [options] your-schema-file.xsd
 * See sample usage below:
 
```bash
➜  target git:(master) ✗ java -jar android-jaxb-1.0.jar --help
usage: java -jar android-jaxb-1.0.jar [options] your-schema-file.xsd
---------------------------------------------------------------------
 -b,--bindings <arg>      (optional) bindings JSON file
 -d,--destination <arg>   destination directory for generated classes
 -h,--help                Help on usage
 -p,--package <arg>       package name for generated classes. Eg.:
                          com.example.app
 -v,--version             Version
---------------------------------------------------------------------
➜  target git:(master) ✗ java -jar android-jaxb-1.0.jar -b /Users/yeshodhan/projects/xsd-to-simplexml/src/test/resources/bindings.json -d /Users/yeshodhan/projects/xsd-to-simplexml/src/test/java -p com.mickoo.person /Users/yeshodhan/projects/xsd-to-simplexml/src/test/resources/person.xsd
Reading bindings ...
Code Generator Initialized. Destination Directory: /Users/yeshodhan/projects/xsd-to-simplexml/src/test/java
[Element /Person    Min Occurs: null, Max Occurs: null ] of type [Person][Start of sequence Min Occurs: 1, Max Occurs: 1 ]
	[Element /Person/FirstName    Min Occurs: 0, Max Occurs: 1 ] of type [string]
	[Element /Person/LastName    Min Occurs: 0, Max Occurs: 1 ] of type [string]
	[Element /Person/Adult    Min Occurs: 0, Max Occurs: 1 ] of type [boolean]
	[Element /Person/Addresses    Min Occurs: 0, Max Occurs: 1 ] of type [Addresses]	[Start of sequence Min Occurs: 1, Max Occurs: 1 ]
		[Element /Person/Addresses/Address    Min Occurs: 0, Max Occurs: -1 ] of type [Address]		[Start of sequence Min Occurs: 1, Max Occurs: 1 ]
			[Element /Person/Addresses/Address/Line1    Min Occurs: 0, Max Occurs: 1 ] of type [string]
			[Element /Person/Addresses/Address/Line2    Min Occurs: 0, Max Occurs: 1 ] of type [string]
			[Element /Person/Addresses/Address/City    Min Occurs: 0, Max Occurs: 1 ] of type [string]
			[Element /Person/Addresses/Address/State    Min Occurs: 0, Max Occurs: 1 ] of type [string]
			[Element /Person/Addresses/Address/Country    Min Occurs: 1, Max Occurs: 1 ] of type [string]
			[Element /Person/Addresses/Address/PostalCode    Min Occurs: 0, Max Occurs: 1 ] of type [string]
		[End of sequence]
	[End of sequence]
	[Element /Person/Gender    Min Occurs: 0, Max Occurs: 1 ] of type [Gender][Values = MALE, FEMALE, NOT_SPECIFIED]	
	[Element /Person/Favorite_Fruits    Min Occurs: 0, Max Occurs: 3 ] of type [Fruits][Values = Apple, Banana, Mango, Orange, Grapes, Watermelon, Peach, Apricot, Grapefruit]	
	[Element /Person/SomeThing_really_whacky-by-the-user    Min Occurs: 0, Max Occurs: 1 ] of type [string]
[End of sequence]
[Attribute /Person/@id    Min Occurs: 0, Max Occurs: 1 ] of type [string]
Schema parsing complete.
Generating classes under /Users/yeshodhan/projects/xsd-to-simplexml/src/test/java
com/mickoo/person/Address.java
com/mickoo/person/Addresses.java
com/mickoo/person/Fruits.java
com/mickoo/person/GenderEnum.java
com/mickoo/person/Person.java
Android JAXB execution complete. Generated 5 classes in 315 milliseconds.
Please verify the generated classes for compile errors and syntax issues.
``` 

 * If you want to run it from any directory, download install.sh file and run > sudo ./install.sh to download and install. Android jaxb will be available in your path.
 
```bash
➜  xsd-to-simplexml git:(master) ✗ sudo ./install.sh
Downloading AndroidJAXB from https://s3.amazonaws.com/yeshodhan/android-jaxb-1.0.jar
% Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                              Dload  Upload   Total   Spent    Left  Speed
100 2444k  100 2444k    0     0   463k      0  0:00:05  0:00:05 --:--:--  537k
Installing ...
Installation Complete
usage: java -jar android-jaxb-1.0.jar [options] your-schema-file.xsd
---------------------------------------------------------------------
-b,--bindings <arg>      (optional) bindings JSON file
-d,--destination <arg>   destination directory for generated classes
-h,--help                Help on usage
-p,--package <arg>       package name for generated classes. Eg.:
                       com.example.app
-v,--version             Version
---------------------------------------------------------------------
```
 

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
        <xsd:attribute name="id" type="xsd:string"/>
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
#### Bindings JSON File

```json
{
  "complexTypes": {
  },
  "enums": {
    "Gender": {
      "classname": "GenderEnum",
      "attributes": [
        {
          "name": "id",
          "type": "int"
        },
        {
          "name": "description",
          "type": "string"
        }
      ],
      "values": [
        {
          "key": "MALE",
          "attributes": [0, "Men are from Mars"]
        },
        {
          "key": "FEMALE",
          "attributes": [1, "Women are from Venus"]
        },
        {
          "key": "NOT_SPECIFIED",
          "attributes": [2, "Can't say anything"]
        }
      ]
    }
  }
}
```

#### Generated Java Classes

```java



package com.mickoo.person;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Address<br>
 * Generated using Android JAXB<br>
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
 * Generated using Android JAXB<br>
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
public enum GenderEnum {

    MALE(0, "Men are from Mars"),
    FEMALE(1, "Women are from Venus"),
    NOT_SPECIFIED(2, "Can't say anything");
    private final Integer id;
    private final String description;

    private GenderEnum(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer id() {
        return id;
    }

    public String description() {
        return description;
    }

}


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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}






```

#### Serialized XML

##### Sample Code to serialize XML from generated Java Classes

```java
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

        File result = new File(TEST_RESOURCES_DIR+"/person.xml");
        serializer.write(person, result);
    }
```
##### XML Output

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Person id="1001" xmlns="http://person.mickoo.com/">
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
