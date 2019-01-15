
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * TerzoIntermediarioSoggettoEmittenteType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "TerzoIntermediarioSoggettoEmittenteType")
@Namespace(reference = "")
public class TerzoIntermediarioSoggettoEmittenteType {

    @Element(name = "DatiAnagrafici", required = true)
    private DatiAnagraficiTerzoIntermediarioType datiAnagrafici;

    public TerzoIntermediarioSoggettoEmittenteType() {
    }

    public DatiAnagraficiTerzoIntermediarioType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(DatiAnagraficiTerzoIntermediarioType datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

}
