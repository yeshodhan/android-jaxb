
package com.vast;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "deliveryEnum")
@Namespace(reference = "")
public enum DeliveryEnum {

    streaming,
    progressive;

}
