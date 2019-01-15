
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * SignedInfoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "SignedInfoType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class SignedInfoType {

    @Element(name = "CanonicalizationMethod", required = true)
    private CanonicalizationMethodType canonicalizationMethod;
    @Element(name = "SignatureMethod", required = true)
    private SignatureMethodType signatureMethod;
    @ElementList(name = "Reference", entry = "Reference", inline = true, required = true)
    private List<ReferenceType> reference;
    @Attribute(name = "Id", required = false)
    private String id;

    public SignedInfoType() {
    }

    public CanonicalizationMethodType getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(CanonicalizationMethodType canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    public SignatureMethodType getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(SignatureMethodType signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public List<ReferenceType> getReference() {
        return reference;
    }

    public void setReference(List<ReferenceType> reference) {
        this.reference = reference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
