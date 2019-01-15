
package com.fatturapa;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "FormatoTrasmissioneType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum FormatoTrasmissioneType {

    FPA12,
    FPR12;

}
