package com.mickoo.xml.xsd2simplexml.bindings;

/**
 * Enum Attribute Definition
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class EnumAttribute {

    private String name;
    private String type;
    private Class typeClz;

    public EnumAttribute(String name, String type) {
        this.name = name;
        this.type = type;
        initTypeClass();
    }
    
    private void initTypeClass(){
        if(type.equals("int")) {
            this.typeClz = Integer.class;
        } else if(type.equalsIgnoreCase("float")) {
            this.typeClz = Float.class;
        } else if(type.equalsIgnoreCase("char")) {
            this.typeClz = Character.class;
        } else if(type.equalsIgnoreCase("double")) {
            this.typeClz = Double.class;
        } else if(type.equalsIgnoreCase("long")) {
            this.typeClz = Long.class;
        } else if(type.equalsIgnoreCase("short")) {
            this.typeClz = Short.class;
        } else if(type.equalsIgnoreCase("String")) {
            this.typeClz = String.class;
        } else if(type.equalsIgnoreCase("boolean")) {
            this.typeClz = Boolean.class;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        initTypeClass();
    }

    public Class getTypeClz() {
        return typeClz;
    }
}
