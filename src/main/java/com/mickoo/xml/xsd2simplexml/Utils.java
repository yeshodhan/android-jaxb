package com.mickoo.xml.xsd2simplexml;

import java.util.HashMap;
import java.util.Map;

/**
 * com.mickoo.xml.xsd2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class Utils {

    public static Map<String, String> getParam(String key, String value) {
        Map<String, String> ret = new HashMap<String, String>();
        ret.put(key, value);
        return ret;
    }

    public static boolean isEmpty(String s) {
        if(s == null) return true;
        if(s.trim().length() == 0) return true;
        return false;
    }


}
