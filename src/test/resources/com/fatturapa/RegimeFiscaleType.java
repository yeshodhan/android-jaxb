
package com.fatturapa;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "RegimeFiscaleType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum RegimeFiscaleType {

    RF01,
    RF02,
    RF04,
    RF05,
    RF06,
    RF07,
    RF08,
    RF09,
    RF10,
    RF11,
    RF12,
    RF13,
    RF14,
    RF15,
    RF16,
    RF17,
    RF19,
    RF18;

}
