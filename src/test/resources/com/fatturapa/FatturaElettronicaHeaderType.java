
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * FatturaElettronicaHeaderType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "FatturaElettronicaHeaderType")
@Namespace(reference = "")
public class FatturaElettronicaHeaderType {

    @Element(name = "DatiTrasmissione", required = true)
    private DatiTrasmissioneType datiTrasmissione;
    @Element(name = "CedentePrestatore", required = true)
    private CedentePrestatoreType cedentePrestatore;
    @Element(name = "RappresentanteFiscale", required = false)
    private RappresentanteFiscaleType rappresentanteFiscale;
    @Element(name = "CessionarioCommittente", required = true)
    private CessionarioCommittenteType cessionarioCommittente;
    @Element(name = "TerzoIntermediarioOSoggettoEmittente", required = false)
    private TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioOSoggettoEmittente;
    @Element(name = "SoggettoEmittente", required = false)
    private SoggettoEmittenteType soggettoEmittente;

    public FatturaElettronicaHeaderType() {
    }

    public DatiTrasmissioneType getDatiTrasmissione() {
        return datiTrasmissione;
    }

    public void setDatiTrasmissione(DatiTrasmissioneType datiTrasmissione) {
        this.datiTrasmissione = datiTrasmissione;
    }

    public CedentePrestatoreType getCedentePrestatore() {
        return cedentePrestatore;
    }

    public void setCedentePrestatore(CedentePrestatoreType cedentePrestatore) {
        this.cedentePrestatore = cedentePrestatore;
    }

    public RappresentanteFiscaleType getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    public void setRappresentanteFiscale(RappresentanteFiscaleType rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

    public CessionarioCommittenteType getCessionarioCommittente() {
        return cessionarioCommittente;
    }

    public void setCessionarioCommittente(CessionarioCommittenteType cessionarioCommittente) {
        this.cessionarioCommittente = cessionarioCommittente;
    }

    public TerzoIntermediarioSoggettoEmittenteType getTerzoIntermediarioOSoggettoEmittente() {
        return terzoIntermediarioOSoggettoEmittente;
    }

    public void setTerzoIntermediarioOSoggettoEmittente(TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioOSoggettoEmittente) {
        this.terzoIntermediarioOSoggettoEmittente = terzoIntermediarioOSoggettoEmittente;
    }

    public SoggettoEmittenteType getSoggettoEmittente() {
        return soggettoEmittente;
    }

    public void setSoggettoEmittente(SoggettoEmittenteType soggettoEmittente) {
        this.soggettoEmittente = soggettoEmittente;
    }

}
