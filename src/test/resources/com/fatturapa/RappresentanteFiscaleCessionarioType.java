
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * RappresentanteFiscaleCessionarioType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "RappresentanteFiscaleCessionarioType")
@Namespace(reference = "")
public class RappresentanteFiscaleCessionarioType {

    @Element(name = "IdFiscaleIVA", required = true)
    private IdFiscaleType idFiscaleIVA;
    @Element(name = "Denominazione", required = true)
    private String denominazione;
    @Element(name = "Nome", required = true)
    private String nome;
    @Element(name = "Cognome", required = true)
    private String cognome;

    public RappresentanteFiscaleCessionarioType() {
    }

    public IdFiscaleType getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(IdFiscaleType idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

}
