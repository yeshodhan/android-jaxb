
package com.fatturapa;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TransformsType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TransformsType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class TransformsType {

    @ElementList(name = "Transform", entry = "Transform", inline = true, required = true)
    private List<TransformType> transform;

    public TransformsType() {
    }

    public List<TransformType> getTransform() {
        return transform;
    }

    public void setTransform(List<TransformType> transform) {
        this.transform = transform;
    }

}
