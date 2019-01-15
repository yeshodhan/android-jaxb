
package com.vast;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * VideoClicks<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "VideoClicks")
@Namespace(reference = "")
public class VideoClicks {

    @ElementList(name = "ClickTracking", entry = "ClickTracking", inline = true, required = false)
    private List<ClickTracking> clickTracking;

    public VideoClicks() {
    }

    public List<ClickTracking> getClickTracking() {
        return clickTracking;
    }

    public void setClickTracking(List<ClickTracking> clickTracking) {
        this.clickTracking = clickTracking;
    }

}
