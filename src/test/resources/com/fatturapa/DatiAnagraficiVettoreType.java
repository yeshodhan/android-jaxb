
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiAnagraficiVettoreType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiAnagraficiVettoreType")
@Namespace(reference = "")
public class DatiAnagraficiVettoreType {

    @Element(name = "IdFiscaleIVA", required = true)
    private IdFiscaleType idFiscaleIVA;
    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;
    @Element(name = "Anagrafica", required = true)
    private AnagraficaType anagrafica;
    @Element(name = "NumeroLicenzaGuida", required = false)
    private String numeroLicenzaGuida;

    public DatiAnagraficiVettoreType() {
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

    public String getNumeroLicenzaGuida() {
        return numeroLicenzaGuida;
    }

    public void setNumeroLicenzaGuida(String numeroLicenzaGuida) {
        this.numeroLicenzaGuida = numeroLicenzaGuida;
    }

}
