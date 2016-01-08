
package com.mickoo.person;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "Gender")
@Namespace(reference = "http://person.mickoo.com/")
public enum GenderEnum {

    MALE(0, "Men are from Mars"),
    FEMALE(1, "Women are from Venus"),
    NOT_SPECIFIED(2, "Can't say anything");
    private final Integer id;
    private final String description;

    private GenderEnum(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer id() {
        return id;
    }

    public String description() {
        return description;
    }

}
