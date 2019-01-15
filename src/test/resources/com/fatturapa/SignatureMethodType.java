
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * SignatureMethodType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "SignatureMethodType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class SignatureMethodType {

    @Element(name = "HMACOutputLength", required = false)
    private String hmacOutputLength;
    @Attribute(name = "Algorithm", required = true)
    private String algorithm;

    public SignatureMethodType() {
    }

    public String getHmacOutputLength() {
        return hmacOutputLength;
    }

    public void setHmacOutputLength(String hmacOutputLength) {
        this.hmacOutputLength = hmacOutputLength;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
