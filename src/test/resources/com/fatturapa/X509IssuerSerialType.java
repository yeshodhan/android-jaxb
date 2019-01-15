
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * X509IssuerSerialType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "X509IssuerSerialType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class X509IssuerSerialType {

    @Element(name = "X509IssuerName", required = true)
    private String x509IssuerName;
    @Element(name = "X509SerialNumber", required = true)
    private Integer x509SerialNumber;

    public X509IssuerSerialType() {
    }

    public String getX509IssuerName() {
        return x509IssuerName;
    }

    public void setX509IssuerName(String x509IssuerName) {
        this.x509IssuerName = x509IssuerName;
    }

    public Integer getX509SerialNumber() {
        return x509SerialNumber;
    }

    public void setX509SerialNumber(Integer x509SerialNumber) {
        this.x509SerialNumber = x509SerialNumber;
    }

}
