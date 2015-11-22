package com.mickoo.xml.xsd2simplexml;

import java.util.HashMap;
import java.util.Map;

/**
 * com.mickoo.xml.xsd2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class Utils {

    public static Map<String, String> getParam(String key, String value) {
        Map<String, String> ret = new HashMap<String, String>();
        ret.put(key, value);
        return ret;
    }

}
