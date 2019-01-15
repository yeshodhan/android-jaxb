
package com.vast;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Creatives<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Creatives")
@Namespace(reference = "")
public class Creatives {

    @ElementList(name = "Creative", entry = "Creative", inline = true, required = true)
    private List<Creative> creative;

    public Creatives() {
    }

    public List<Creative> getCreative() {
        return creative;
    }

    public void setCreative(List<Creative> creative) {
        this.creative = creative;
    }

}
