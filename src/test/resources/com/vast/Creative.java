
package com.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Creative<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Creative")
@Namespace(reference = "")
public class Creative {

    @Element(name = "Linear", required = false)
    private Linear linear;
    @Element(name = "CompanionAds", required = false)
    private CompanionAds companionAds;
    @Element(name = "NonLinearAds", required = false)
    private NonLinearAds nonLinearAds;
    @Attribute(name = "AdID", required = false)
    private String adID;
    @Attribute(name = "sequence", required = false)
    private Integer sequence;
    @Attribute(name = "id", required = false)
    private String id;

    public Creative() {
    }

    public Linear getLinear() {
        return linear;
    }

    public void setLinear(Linear linear) {
        this.linear = linear;
    }

    public CompanionAds getCompanionAds() {
        return companionAds;
    }

    public void setCompanionAds(CompanionAds companionAds) {
        this.companionAds = companionAds;
    }

    public NonLinearAds getNonLinearAds() {
        return nonLinearAds;
    }

    public void setNonLinearAds(NonLinearAds nonLinearAds) {
        this.nonLinearAds = nonLinearAds;
    }

    public String getAdID() {
        return adID;
    }

    public void setAdID(String adID) {
        this.adID = adID;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
