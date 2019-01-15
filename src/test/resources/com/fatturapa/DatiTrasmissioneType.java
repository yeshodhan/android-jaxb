
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiTrasmissioneType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiTrasmissioneType")
@Namespace(reference = "")
public class DatiTrasmissioneType {

    @Element(name = "IdTrasmittente", required = true)
    private IdFiscaleType idTrasmittente;
    @Element(name = "ProgressivoInvio", required = true)
    private String progressivoInvio;
    @Element(name = "FormatoTrasmissione", required = true)
    private FormatoTrasmissioneType formatoTrasmissione;
    @Element(name = "CodiceDestinatario", required = true)
    private String codiceDestinatario;
    @Element(name = "ContattiTrasmittente", required = false)
    private ContattiTrasmittenteType contattiTrasmittente;
    @Element(name = "PECDestinatario", required = false)
    private String pecDestinatario;

    public DatiTrasmissioneType() {
    }

    public IdFiscaleType getIdTrasmittente() {
        return idTrasmittente;
    }

    public void setIdTrasmittente(IdFiscaleType idTrasmittente) {
        this.idTrasmittente = idTrasmittente;
    }

    public String getProgressivoInvio() {
        return progressivoInvio;
    }

    public void setProgressivoInvio(String progressivoInvio) {
        this.progressivoInvio = progressivoInvio;
    }

    public FormatoTrasmissioneType getFormatoTrasmissione() {
        return formatoTrasmissione;
    }

    public void setFormatoTrasmissione(FormatoTrasmissioneType formatoTrasmissione) {
        this.formatoTrasmissione = formatoTrasmissione;
    }

    public String getCodiceDestinatario() {
        return codiceDestinatario;
    }

    public void setCodiceDestinatario(String codiceDestinatario) {
        this.codiceDestinatario = codiceDestinatario;
    }

    public ContattiTrasmittenteType getContattiTrasmittente() {
        return contattiTrasmittente;
    }

    public void setContattiTrasmittente(ContattiTrasmittenteType contattiTrasmittente) {
        this.contattiTrasmittente = contattiTrasmittente;
    }

    public String getPecDestinatario() {
        return pecDestinatario;
    }

    public void setPecDestinatario(String pecDestinatario) {
        this.pecDestinatario = pecDestinatario;
    }

}
