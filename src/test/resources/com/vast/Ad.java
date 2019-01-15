
package com.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Ad<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Ad")
@Namespace(reference = "")
public class Ad {

    @Element(name = "InLine", required = false)
    private InLine inLine;
    @Element(name = "Wrapper", required = false)
    private Wrapper wrapper;
    @Attribute(name = "id", required = true)
    private String id;

    public Ad() {
    }

    public InLine getInLine() {
        return inLine;
    }

    public void setInLine(InLine inLine) {
        this.inLine = inLine;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
