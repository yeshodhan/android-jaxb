
package com.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;


/**
 * StaticResource<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "StaticResource")
@Namespace(reference = "")
public class StaticResource {

    @Text(required = true)
    private String value;
    @Attribute(name = "creativeType", required = true)
    private String creativeType;

    public StaticResource() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(String creativeType) {
        this.creativeType = creativeType;
    }

}
