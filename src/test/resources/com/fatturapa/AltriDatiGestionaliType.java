
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AltriDatiGestionaliType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AltriDatiGestionaliType")
@Namespace(reference = "")
public class AltriDatiGestionaliType {

    @Element(name = "TipoDato", required = true)
    private String tipoDato;
    @Element(name = "RiferimentoTesto", required = false)
    private String riferimentoTesto;
    @Element(name = "RiferimentoNumero", required = false)
    private String riferimentoNumero;
    @Element(name = "RiferimentoData", required = false)
    private String riferimentoData;

    public AltriDatiGestionaliType() {
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getRiferimentoTesto() {
        return riferimentoTesto;
    }

    public void setRiferimentoTesto(String riferimentoTesto) {
        this.riferimentoTesto = riferimentoTesto;
    }

    public String getRiferimentoNumero() {
        return riferimentoNumero;
    }

    public void setRiferimentoNumero(String riferimentoNumero) {
        this.riferimentoNumero = riferimentoNumero;
    }

    public String getRiferimentoData() {
        return riferimentoData;
    }

    public void setRiferimentoData(String riferimentoData) {
        this.riferimentoData = riferimentoData;
    }

}
