package com.mickoo.xml.xsd2simplexml.bindings;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Bindings
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class Bindings {

    private static final Logger logger = Logger.getLogger(Bindings.class);

    Map<String, EnumBinding> enumBindings = new HashMap<String, EnumBinding>();

    public Bindings() {
    }

    public void readBindings(File bindingFile) throws IOException {

        if(bindingFile == null) return;
        if(!bindingFile.exists()) {
            logger.error("Binding files not found.");
            return;
        }

        logger.info("Reading bindings ...");

        String bindings = FileUtils.readFileToString(bindingFile);
        JSONObject j_bindings = new JSONObject(bindings);
        JSONObject j_enums = j_bindings.optJSONObject("enums");
        if(j_enums != null) {
            Iterator<String> keys = j_enums.keys();
            while(keys.hasNext()) {
                String key = keys.next();
                JSONObject j_enumBinding = j_enums.optJSONObject(key);

                String classname = j_enumBinding.optString("classname");

                List<EnumAttribute> enumAttributes = new ArrayList<EnumAttribute>();
                
                JSONArray j_attributes = j_enumBinding.optJSONArray("attributes");
                for(int i=0; i<j_attributes.length(); i++) {
                    JSONObject j_attribute = j_attributes.optJSONObject(i);
                    String name = j_attribute.optString("name");
                    String type = j_attribute.optString("type");
                    enumAttributes.add(new EnumAttribute(name, type));
                }

                List<EnumAttributeValue> enumAttributeValues= new ArrayList<EnumAttributeValue>();

                JSONArray j_values = j_enumBinding.optJSONArray("values");
                for(int i=0; i<j_values.length(); i++) {
                    JSONObject j_value = j_values.optJSONObject(i);
                    String enumValueKey = j_value.optString("key");

                    JSONArray j_attributeValues = j_value.optJSONArray("attributes");

                    List<Object> attributeValues = new ArrayList<Object>();
                    EnumAttributeValue enumAttributeValue = new EnumAttributeValue(enumValueKey, attributeValues);

                    for(int j=0; j<j_attributeValues.length(); j++) {
                        EnumAttribute enumAttribute = enumAttributes.get(j);
                        attributeValues.add(j_attributeValues.get(j));
                    }

                    enumAttributeValues.add(enumAttributeValue);
                }

                EnumBinding enumBinding = new EnumBinding(classname, enumAttributes, enumAttributeValues);
                enumBindings.put(key, enumBinding);
            }
        }
    }

    public EnumBinding getEnumBinding(String key){
        return enumBindings.get(key);
    }
}
