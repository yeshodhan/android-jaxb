
package com.vast;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * TrackingEventsType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TrackingEvents_type")
@Namespace(reference = "")
public class TrackingEventsType {

    @ElementList(name = "Tracking", entry = "Tracking", inline = true, required = false)
    private List<Tracking> tracking;

    public TrackingEventsType() {
    }

    public List<Tracking> getTracking() {
        return tracking;
    }

    public void setTracking(List<Tracking> tracking) {
        this.tracking = tracking;
    }

}
