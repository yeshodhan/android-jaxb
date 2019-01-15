
package com.vast;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * NonLinearAds<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "NonLinearAds")
@Namespace(reference = "")
public class NonLinearAds {

    @Element(name = "TrackingEvents", required = false)
    private TrackingEventsType trackingEvents;
    @ElementList(name = "NonLinear", entry = "NonLinear", inline = true, required = true)
    private List<NonLinearType> nonLinear;

    public NonLinearAds() {
    }

    public TrackingEventsType getTrackingEvents() {
        return trackingEvents;
    }

    public void setTrackingEvents(TrackingEventsType trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    public List<NonLinearType> getNonLinear() {
        return nonLinear;
    }

    public void setNonLinear(List<NonLinearType> nonLinear) {
        this.nonLinear = nonLinear;
    }

}
