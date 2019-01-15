
package com.mickoo.person;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Pets<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Pets")
@Namespace(reference = "http://person.mickoo.com/")
public class Pets {

    @ElementList(name = "Pet", entry = "Pet", inline = true, required = false)
    private List<Pet> pet;

    public Pets() {
    }

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

}
