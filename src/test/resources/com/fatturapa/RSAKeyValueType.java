
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RSAKeyValueType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RSAKeyValueType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class RSAKeyValueType {

    @Element(name = "Modulus", required = true)
    private String modulus;
    @Element(name = "Exponent", required = true)
    private String exponent;

    public RSAKeyValueType() {
    }

    public String getModulus() {
        return modulus;
    }

    public void setModulus(String modulus) {
        this.modulus = modulus;
    }

    public String getExponent() {
        return exponent;
    }

    public void setExponent(String exponent) {
        this.exponent = exponent;
    }

}
