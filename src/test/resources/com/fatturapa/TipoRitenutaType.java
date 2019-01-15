
package com.fatturapa;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "TipoRitenutaType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoRitenutaType {

    RT01,
    RT02;

}
