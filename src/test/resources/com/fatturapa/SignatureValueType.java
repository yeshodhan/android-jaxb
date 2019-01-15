
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;


/**
 * SignatureValueType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "SignatureValueType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class SignatureValueType {

    @Text(required = true)
    private String value;
    @Attribute(name = "Id", required = false)
    private String id;

    public SignatureValueType() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
