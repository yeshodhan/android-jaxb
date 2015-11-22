
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
