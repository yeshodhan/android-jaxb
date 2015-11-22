package com.mickoo.xml.xsd2simplexml.bindings;

import java.util.List;

/**
 * Enum Attribute Values
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class EnumAttributeValue {

    String key;
    List<Object> attributes;

    public EnumAttributeValue(String key, List attributes) {
        this.key = key;
        this.attributes = attributes;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }
}
