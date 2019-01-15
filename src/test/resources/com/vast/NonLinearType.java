
package com.vast;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * NonLinearType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "NonLinear_type")
@Namespace(reference = "")
public class NonLinearType {

    @Element(name = "StaticResource", required = false)
    private StaticResource staticResource;
    @Element(name = "IFrameResource", required = false)
    private String iFrameResource;
    @Element(name = "HTMLResource", required = false)
    private String htmlResource;
    @Element(name = "NonLinearClickThrough", required = false)
    private String nonLinearClickThrough;
    @Element(name = "AdParameters", required = false)
    private String adParameters;
    @Attribute(name = "width", required = true)
    private Integer width;
    @Attribute(name = "minSuggestedDuration", required = false)
    private String minSuggestedDuration;
    @Attribute(name = "apiFramework", required = false)
    private String apiFramework;
    @Attribute(name = "maintainAspectRatio", required = false)
    private Boolean maintainAspectRatio;
    @Attribute(name = "scalable", required = false)
    private Boolean scalable;
    @Attribute(name = "expandedWidth", required = false)
    private Integer expandedWidth;
    @Attribute(name = "id", required = false)
    private String id;
    @Attribute(name = "height", required = true)
    private Integer height;
    @Attribute(name = "expandedHeight", required = false)
    private Integer expandedHeight;

    public NonLinearType() {
    }

    public StaticResource getStaticResource() {
        return staticResource;
    }

    public void setStaticResource(StaticResource staticResource) {
        this.staticResource = staticResource;
    }

    public String getIFrameResource() {
        return iFrameResource;
    }

    public void setIFrameResource(String iFrameResource) {
        this.iFrameResource = iFrameResource;
    }

    public String getHtmlResource() {
        return htmlResource;
    }

    public void setHtmlResource(String htmlResource) {
        this.htmlResource = htmlResource;
    }

    public String getNonLinearClickThrough() {
        return nonLinearClickThrough;
    }

    public void setNonLinearClickThrough(String nonLinearClickThrough) {
        this.nonLinearClickThrough = nonLinearClickThrough;
    }

    public String getAdParameters() {
        return adParameters;
    }

    public void setAdParameters(String adParameters) {
        this.adParameters = adParameters;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getMinSuggestedDuration() {
        return minSuggestedDuration;
    }

    public void setMinSuggestedDuration(String minSuggestedDuration) {
        this.minSuggestedDuration = minSuggestedDuration;
    }

    public String getApiFramework() {
        return apiFramework;
    }

    public void setApiFramework(String apiFramework) {
        this.apiFramework = apiFramework;
    }

    public Boolean getMaintainAspectRatio() {
        return maintainAspectRatio;
    }

    public void setMaintainAspectRatio(Boolean maintainAspectRatio) {
        this.maintainAspectRatio = maintainAspectRatio;
    }

    public Boolean getScalable() {
        return scalable;
    }

    public void setScalable(Boolean scalable) {
        this.scalable = scalable;
    }

    public Integer getExpandedWidth() {
        return expandedWidth;
    }

    public void setExpandedWidth(Integer expandedWidth) {
        this.expandedWidth = expandedWidth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getExpandedHeight() {
        return expandedHeight;
    }

    public void setExpandedHeight(Integer expandedHeight) {
        this.expandedHeight = expandedHeight;
    }

}
