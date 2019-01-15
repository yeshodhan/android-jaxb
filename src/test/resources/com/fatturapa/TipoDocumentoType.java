
package com.fatturapa;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "TipoDocumentoType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum TipoDocumentoType {

    TD01,
    TD02,
    TD03,
    TD04,
    TD05,
    TD06;

}
