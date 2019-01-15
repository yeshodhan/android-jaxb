
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RappresentanteFiscaleType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RappresentanteFiscaleType")
@Namespace(reference = "")
public class RappresentanteFiscaleType {

    @Element(name = "DatiAnagrafici", required = true)
    private DatiAnagraficiRappresentanteType datiAnagrafici;

    public RappresentanteFiscaleType() {
    }

    public DatiAnagraficiRappresentanteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(DatiAnagraficiRappresentanteType datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

}
