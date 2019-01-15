
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DigestMethodType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DigestMethodType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class DigestMethodType {

    @Attribute(name = "Algorithm", required = true)
    private String algorithm;

    public DigestMethodType() {
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
