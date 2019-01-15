
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RetrievalMethodType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RetrievalMethodType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class RetrievalMethodType {

    @Element(name = "Transforms", required = false)
    private TransformsType transforms;
    @Attribute(name = "URI", required = false)
    private String uri;
    @Attribute(name = "Type", required = false)
    private String type;

    public RetrievalMethodType() {
    }

    public TransformsType getTransforms() {
        return transforms;
    }

    public void setTransforms(TransformsType transforms) {
        this.transforms = transforms;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
