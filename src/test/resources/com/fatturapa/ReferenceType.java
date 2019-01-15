
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ReferenceType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ReferenceType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class ReferenceType {

    @Element(name = "Transforms", required = false)
    private TransformsType transforms;
    @Element(name = "DigestMethod", required = true)
    private DigestMethodType digestMethod;
    @Element(name = "DigestValue", required = true)
    private String digestValue;
    @Attribute(name = "URI", required = false)
    private String uri;
    @Attribute(name = "Id", required = false)
    private String id;
    @Attribute(name = "Type", required = false)
    private String type;

    public ReferenceType() {
    }

    public TransformsType getTransforms() {
        return transforms;
    }

    public void setTransforms(TransformsType transforms) {
        this.transforms = transforms;
    }

    public DigestMethodType getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(DigestMethodType digestMethod) {
        this.digestMethod = digestMethod;
    }

    public String getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(String digestValue) {
        this.digestValue = digestValue;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
