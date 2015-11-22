package com.mickoo.xml.xsd2simplexml;

import com.sun.codemodel.*;
import com.sun.xml.bind.api.impl.NameConverter;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

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

    public GeneratedClass(JCodeModel codeModel, JDefinedClass generatedClass) {
        this.codeModel = codeModel;
        this.generatedClass = generatedClass;
    }

    public void addElement(int modifer, Class type, String name, int minOccurs, boolean unbounded, boolean attribute) {
        String fieldName = NameConverter.smart.toVariableName(name);
        JFieldVar jField = generatedClass.field(modifer, type, fieldName);
        JAnnotationUse jAnnotationUse = null;
        if(attribute){
            jAnnotationUse = jField.annotate(Attribute.class);
        } else {
            jAnnotationUse = jField.annotate(Element.class);
        }

        jAnnotationUse.param("name", name);
        if(minOccurs == 0) {
            jAnnotationUse.param("required", false);
            addGetterSetter(jField, fieldName, type);
        } else if(minOccurs == 1){
            jAnnotationUse.param("required", true);
            addGetterSetter(jField, fieldName, type);
        } else if(minOccurs > 1 || unbounded) {
            //todo - create list
        }
    }

    public void addGetterSetter(JFieldVar jField, String name, Class type) {
        String propertyName = NameConverter.smart.toPropertyName(name);
        String getterPrefix = "get";
        String getterPropertyName = propertyName;
        if(type == Boolean.class) {
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
