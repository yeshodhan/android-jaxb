
package com.vast;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "eventEnum")
@Namespace(reference = "")
public enum EventEnum {

    creativeView,
    start,
    midpoint,
    firstQuartile,
    thirdQuartile,
    complete,
    mute,
    unmute,
    pause,
    rewind,
    resume,
    fullscreen,
    expand,
    collapse,
    acceptInvitation,
    close;

}
