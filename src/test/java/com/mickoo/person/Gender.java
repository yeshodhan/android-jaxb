
package com.mickoo.person;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "Gender")
@Namespace(reference = "http://person.mickoo.com/")
public enum Gender {

    MALE,
    FEMALE,
    NOT_SPECIFIED;

}
