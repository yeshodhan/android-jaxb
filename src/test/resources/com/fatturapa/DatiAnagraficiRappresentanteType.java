
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiAnagraficiRappresentanteType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiAnagraficiRappresentanteType")
@Namespace(reference = "")
public class DatiAnagraficiRappresentanteType {

    @Element(name = "IdFiscaleIVA", required = true)
    private IdFiscaleType idFiscaleIVA;
    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;
    @Element(name = "Anagrafica", required = true)
    private AnagraficaType anagrafica;

    public DatiAnagraficiRappresentanteType() {
    }

    public IdFiscaleType getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(IdFiscaleType idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public AnagraficaType getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(AnagraficaType anagrafica) {
        this.anagrafica = anagrafica;
    }

}
