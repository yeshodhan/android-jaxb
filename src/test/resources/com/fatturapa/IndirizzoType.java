
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * IndirizzoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "IndirizzoType")
@Namespace(reference = "")
public class IndirizzoType {

    @Element(name = "Indirizzo", required = true)
    private String indirizzo;
    @Element(name = "NumeroCivico", required = false)
    private String numeroCivico;
    @Element(name = "CAP", required = true)
    private String cap;
    @Element(name = "Comune", required = true)
    private String comune;
    @Element(name = "Provincia", required = false)
    private String provincia;
    @Element(name = "Nazione", required = true)
    private String nazione;

    public IndirizzoType() {
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNumeroCivico() {
        return numeroCivico;
    }

    public void setNumeroCivico(String numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

}
