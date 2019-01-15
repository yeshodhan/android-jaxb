
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransformType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransformType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class TransformType {

    @Element(name = "XPath", required = true)
    private String xPath;
    @Attribute(name = "Algorithm", required = true)
    private String algorithm;

    public TransformType() {
    }

    public String getXPath() {
        return xPath;
    }

    public void setXPath(String xPath) {
        this.xPath = xPath;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
