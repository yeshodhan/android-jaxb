package com.mickoo.xml.xsd2simplexml.bindings;

import java.util.List;

/**
 * Enum bindings
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class EnumBinding {

    private String className;
    private List<EnumAttribute> attributes;
    private List<EnumAttributeValue> attributeValues;

    public EnumBinding(String className, List<EnumAttribute> attributes, List<EnumAttributeValue> attributeValues) {
        this.className = className;
        this.attributes = attributes;
        this.attributeValues = attributeValues;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<EnumAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<EnumAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<EnumAttributeValue> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<EnumAttributeValue> attributeValues) {
        this.attributeValues = attributeValues;
    }
}
