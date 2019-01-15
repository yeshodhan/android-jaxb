
package com.vast;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * CompanionAds<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CompanionAds")
@Namespace(reference = "")
public class CompanionAds {

    @ElementList(name = "Companion", entry = "Companion", inline = true, required = false)
    private List<CompanionType> companion;

    public CompanionAds() {
    }

    public List<CompanionType> getCompanion() {
        return companion;
    }

    public void setCompanion(List<CompanionType> companion) {
        this.companion = companion;
    }

}
