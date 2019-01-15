
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * SignatureType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "SignatureType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class SignatureType {

    @Element(name = "SignedInfo", required = true)
    private SignedInfoType signedInfo;
    @Element(name = "SignatureValue", required = true)
    private SignatureValueType signatureValue;
    @Element(name = "KeyInfo", required = false)
    private KeyInfoType keyInfo;
    @ElementList(name = "Object", entry = "Object", inline = true, required = false)
    private List<ObjectType> object;
    @Attribute(name = "Id", required = false)
    private String id;

    public SignatureType() {
    }

    public SignedInfoType getSignedInfo() {
        return signedInfo;
    }

    public void setSignedInfo(SignedInfoType signedInfo) {
        this.signedInfo = signedInfo;
    }

    public SignatureValueType getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(SignatureValueType signatureValue) {
        this.signatureValue = signatureValue;
    }

    public KeyInfoType getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfoType keyInfo) {
        this.keyInfo = keyInfo;
    }

    public List<ObjectType> getObject() {
        return object;
    }

    public void setObject(List<ObjectType> object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
