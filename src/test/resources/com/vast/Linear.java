
package com.vast;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * Linear<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "Linear")
@Namespace(reference = "")
public class Linear {

    @Element(name = "Duration", required = true)
    private String duration;
    @Element(name = "TrackingEvents", required = false)
    private TrackingEventsType trackingEvents;
    @Element(name = "AdParameters", required = false)
    private String adParameters;
    @Element(name = "VideoClicks", required = false)
    private VideoClicksType videoClicks;
    @Element(name = "MediaFiles", required = false)
    private MediaFiles mediaFiles;

    public Linear() {
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public TrackingEventsType getTrackingEvents() {
        return trackingEvents;
    }

    public void setTrackingEvents(TrackingEventsType trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    public String getAdParameters() {
        return adParameters;
    }

    public void setAdParameters(String adParameters) {
        this.adParameters = adParameters;
    }

    public VideoClicksType getVideoClicks() {
        return videoClicks;
    }

    public void setVideoClicks(VideoClicksType videoClicks) {
        this.videoClicks = videoClicks;
    }

    public MediaFiles getMediaFiles() {
        return mediaFiles;
    }

    public void setMediaFiles(MediaFiles mediaFiles) {
        this.mediaFiles = mediaFiles;
    }

}
