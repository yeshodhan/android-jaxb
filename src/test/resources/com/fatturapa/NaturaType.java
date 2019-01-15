
package com.fatturapa;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = "NaturaType")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public enum NaturaType {

    N1,
    N2,
    N3,
    N4,
    N5,
    N6,
    N7;

}
