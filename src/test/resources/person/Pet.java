
package com.mickoo.person;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;


/**
 * Pet<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Pet")
@Namespace(reference = "http://person.mickoo.com/")
public class Pet {

    @Text(required = true)
    private String value;
    @Attribute(name = "type", required = false)
    private String type;

    public Pet() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
