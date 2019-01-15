
package com.vast;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * VAST<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "VAST")
@Namespace(reference = "")
public class VAST {

    @ElementList(name = "Ad", entry = "Ad", inline = true, required = false)
    private List<Ad> ad;
    @Attribute(name = "version", required = true)
    private String version;

    public VAST() {
    }

    public List<Ad> getAd() {
        return ad;
    }

    public void setAd(List<Ad> ad) {
        this.ad = ad;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
