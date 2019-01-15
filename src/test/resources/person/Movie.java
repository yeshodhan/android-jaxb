
package com.mickoo.person;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Movie<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Movie")
@Namespace(reference = "http://person.mickoo.com/")
public class Movie {

    @Element(name = "Name", required = false)
    private String name;
    @Element(name = "Person", required = false)
    private Person person;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
