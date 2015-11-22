package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.*;
import com.sun.xml.internal.bind.api.impl.NameConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * com.mickoo.xml.xsd2simplexml
 *
 * @author Yeshodhan Kulkarni (yeshodhan.kulkarni@tp-link.com)
 * @version 1.0
 * @since 1.0
 */
public class GeneratedClass {

    JCodeModel codeModel;
    JDefinedClass generatedClass;

    Set<String> properties = new HashSet<String>();

    public GeneratedClass(JCodeModel codeModel, JDefinedClass generatedClass) {
        this.codeModel = codeModel;
        this.generatedClass = generatedClass;
    }

    public void addElement(JType type, String name, int minOccurs, boolean unbounded, boolean attribute) {
        String fieldName = NameConverter.smart.toVariableName(name);

        if(properties.contains(fieldName)) return;

        if(minOccurs > 1 || unbounded) {

            JClass propertyClass = (JClass) type;
            JClass listClass = codeModel.ref(List.class);
            JClass fieldClass = listClass.narrow(propertyClass);
            JFieldVar jField = generatedClass.field(JMod.PRIVATE, fieldClass, fieldName);

            JAnnotationUse jAnnotationUse = jField.annotate(ElementList.class);
            jAnnotationUse.param("name", name);
            jAnnotationUse.param("entry", name);
            jAnnotationUse.param("inline", true);
            if(minOccurs == 0) {
                jAnnotationUse.param("required", false);
                addGetterSetter(jField, fieldName, type, false);
            } else if(minOccurs == 1){
                jAnnotationUse.param("required", true);
                addGetterSetter(jField, fieldName, type, false);
            }

        } else {

            JFieldVar jField = generatedClass.field(JMod.PRIVATE, type, fieldName);
            JAnnotationUse jAnnotationUse = null;
            if(attribute){
                jAnnotationUse = jField.annotate(Attribute.class);
            } else {
                jAnnotationUse = jField.annotate(Element.class);
            }

            jAnnotationUse.param("name", name);
            if(minOccurs == 0) {
                jAnnotationUse.param("required", false);
                addGetterSetter(jField, fieldName, type, false);
            } else if(minOccurs == 1){
                jAnnotationUse.param("required", true);
                addGetterSetter(jField, fieldName, type, false);
            }
        }

        properties.add(fieldName);
    }

    public void addGetterSetter(JFieldVar jField, String name, JType type, boolean list) {
        String propertyName = NameConverter.smart.toPropertyName(name);
        String getterPrefix = "get";
        String getterPropertyName = propertyName;
        if(type == codeModel.BOOLEAN) {
            if(name.toLowerCase().startsWith("is")){
                getterPrefix = "";
                getterPropertyName = NameConverter.smart.toVariableName(name);
            } else {
                getterPrefix = "is";
            }
        }
        JMethod getterMethod = generatedClass.method(JMod.PUBLIC, jField.type(), getterPrefix + getterPropertyName);
        getterMethod.body()._return(jField);

        JMethod setterMethod = generatedClass.method(JMod.PUBLIC, codeModel.VOID, "set" + propertyName);
        setterMethod.param(jField.type(), name);
        setterMethod.body().assign(JExpr._this().ref(name), JExpr.ref(name));
    }

    public JDefinedClass getGeneratedClass() {
        return generatedClass;
    }
}
