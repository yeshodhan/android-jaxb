
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * SPKIDataType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "SPKIDataType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class SPKIDataType {

    @Element(name = "SPKISexp", required = true)
    private String spkiSexp;

    public SPKIDataType() {
    }

    public String getSpkiSexp() {
        return spkiSexp;
    }

    public void setSpkiSexp(String spkiSexp) {
        this.spkiSexp = spkiSexp;
    }

}
