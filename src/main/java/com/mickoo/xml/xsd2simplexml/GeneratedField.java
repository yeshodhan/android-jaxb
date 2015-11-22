package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.JCodeModel;

/**
 * com.mickoo.xml.xsd2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class GeneratedField {

    GeneratedClass generatedClass;
    JCodeModel codeModel;

    public GeneratedField(JCodeModel codeModel, GeneratedClass generatedClass) {
        this.generatedClass = generatedClass;
        this.codeModel = codeModel;
    }
}
