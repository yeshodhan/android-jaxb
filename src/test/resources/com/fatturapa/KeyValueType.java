
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * KeyValueType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "KeyValueType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class KeyValueType {

    @Element(name = "DSAKeyValue", required = true)
    private DSAKeyValueType dsaKeyValue;
    @Element(name = "RSAKeyValue", required = true)
    private RSAKeyValueType rsaKeyValue;

    public KeyValueType() {
    }

    public DSAKeyValueType getDsaKeyValue() {
        return dsaKeyValue;
    }

    public void setDsaKeyValue(DSAKeyValueType dsaKeyValue) {
        this.dsaKeyValue = dsaKeyValue;
    }

    public RSAKeyValueType getRsaKeyValue() {
        return rsaKeyValue;
    }

    public void setRsaKeyValue(RSAKeyValueType rsaKeyValue) {
        this.rsaKeyValue = rsaKeyValue;
    }

}
