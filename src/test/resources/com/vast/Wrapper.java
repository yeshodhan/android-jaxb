
package com.vast;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * Wrapper<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Wrapper")
@Namespace(reference = "")
public class Wrapper {

    @Element(name = "AdSystem", required = true)
    private AdSystemType adSystem;
    @Element(name = "VASTAdTagURI", required = true)
    private String vastAdTagURI;
    @Element(name = "Error", required = false)
    private String error;
    @ElementList(name = "Impression", entry = "Impression", inline = true, required = true)
    private List<String> impression;
    @Element(name = "Creatives", required = true)
    private Creatives creatives;
    @Element(name = "Extensions", required = false)
    private Extensions extensions;

    public Wrapper() {
    }

    public AdSystemType getAdSystem() {
        return adSystem;
    }

    public void setAdSystem(AdSystemType adSystem) {
        this.adSystem = adSystem;
    }

    public String getVastAdTagURI() {
        return vastAdTagURI;
    }

    public void setVastAdTagURI(String vastAdTagURI) {
        this.vastAdTagURI = vastAdTagURI;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<String> getImpression() {
        return impression;
    }

    public void setImpression(List<String> impression) {
        this.impression = impression;
    }

    public Creatives getCreatives() {
        return creatives;
    }

    public void setCreatives(Creatives creatives) {
        this.creatives = creatives;
    }

    public Extensions getExtensions() {
        return extensions;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

}
