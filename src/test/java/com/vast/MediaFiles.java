
package com.vast;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * MediaFiles<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "MediaFiles")
@Namespace(reference = "")
public class MediaFiles {

    @ElementList(name = "MediaFile", entry = "MediaFile", inline = true, required = true)
    private List<MediaFile> mediaFile;

    public MediaFiles() {
    }

    public List<MediaFile> getMediaFile() {
        return mediaFile;
    }

    public void setMediaFile(List<MediaFile> mediaFile) {
        this.mediaFile = mediaFile;
    }

}
