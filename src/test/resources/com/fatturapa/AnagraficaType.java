
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AnagraficaType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AnagraficaType")
@Namespace(reference = "")
public class AnagraficaType {

    @Element(name = "Denominazione", required = true)
    private String denominazione;
    @Element(name = "Nome", required = true)
    private String nome;
    @Element(name = "Cognome", required = true)
    private String cognome;
    @Element(name = "Titolo", required = false)
    private String titolo;
    @Element(name = "CodEORI", required = false)
    private String codEORI;

    public AnagraficaType() {
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

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCodEORI() {
        return codEORI;
    }

    public void setCodEORI(String codEORI) {
        this.codEORI = codEORI;
    }

}
