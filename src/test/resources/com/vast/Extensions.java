
package com.vast;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Extensions<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Extensions")
@Namespace(reference = "")
public class Extensions {

    @ElementList(name = "Extension", entry = "Extension", inline = true, required = false)
    private List<AnyType> extension;

    public Extensions() {
    }

    public List<AnyType> getExtension() {
        return extension;
    }

    public void setExtension(List<AnyType> extension) {
        this.extension = extension;
    }

}
