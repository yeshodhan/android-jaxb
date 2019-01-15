
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiSALType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiSALType")
@Namespace(reference = "")
public class DatiSALType {

    @Element(name = "RiferimentoFase", required = true)
    private String riferimentoFase;

    public DatiSALType() {
    }

    public String getRiferimentoFase() {
        return riferimentoFase;
    }

    public void setRiferimentoFase(String riferimentoFase) {
        this.riferimentoFase = riferimentoFase;
    }

}
