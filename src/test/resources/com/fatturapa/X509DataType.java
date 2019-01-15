
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * X509DataType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "X509DataType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class X509DataType {

    @Element(name = "X509IssuerSerial", required = true)
    private X509IssuerSerialType x509IssuerSerial;
    @Element(name = "X509SKI", required = true)
    private String x509SKI;
    @Element(name = "X509SubjectName", required = true)
    private String x509SubjectName;
    @Element(name = "X509Certificate", required = true)
    private String x509Certificate;
    @Element(name = "X509CRL", required = true)
    private String x509CRL;

    public X509DataType() {
    }

    public X509IssuerSerialType getX509IssuerSerial() {
        return x509IssuerSerial;
    }

    public void setX509IssuerSerial(X509IssuerSerialType x509IssuerSerial) {
        this.x509IssuerSerial = x509IssuerSerial;
    }

    public String getX509SKI() {
        return x509SKI;
    }

    public void setX509SKI(String x509SKI) {
        this.x509SKI = x509SKI;
    }

    public String getX509SubjectName() {
        return x509SubjectName;
    }

    public void setX509SubjectName(String x509SubjectName) {
        this.x509SubjectName = x509SubjectName;
    }

    public String getX509Certificate() {
        return x509Certificate;
    }

    public void setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    public String getX509CRL() {
        return x509CRL;
    }

    public void setX509CRL(String x509CRL) {
        this.x509CRL = x509CRL;
    }

}
