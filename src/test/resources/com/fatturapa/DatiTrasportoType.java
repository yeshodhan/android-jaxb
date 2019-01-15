
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiTrasportoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiTrasportoType")
@Namespace(reference = "")
public class DatiTrasportoType {

    @Element(name = "DatiAnagraficiVettore", required = false)
    private DatiAnagraficiVettoreType datiAnagraficiVettore;
    @Element(name = "MezzoTrasporto", required = false)
    private String mezzoTrasporto;
    @Element(name = "CausaleTrasporto", required = false)
    private String causaleTrasporto;
    @Element(name = "NumeroColli", required = false)
    private String numeroColli;
    @Element(name = "Descrizione", required = false)
    private String descrizione;
    @Element(name = "UnitaMisuraPeso", required = false)
    private String unitaMisuraPeso;
    @Element(name = "PesoLordo", required = false)
    private String pesoLordo;
    @Element(name = "PesoNetto", required = false)
    private String pesoNetto;
    @Element(name = "DataOraRitiro", required = false)
    private String dataOraRitiro;
    @Element(name = "DataInizioTrasporto", required = false)
    private String dataInizioTrasporto;
    @Element(name = "TipoResa", required = false)
    private String tipoResa;
    @Element(name = "IndirizzoResa", required = false)
    private IndirizzoType indirizzoResa;
    @Element(name = "DataOraConsegna", required = false)
    private String dataOraConsegna;

    public DatiTrasportoType() {
    }

    public DatiAnagraficiVettoreType getDatiAnagraficiVettore() {
        return datiAnagraficiVettore;
    }

    public void setDatiAnagraficiVettore(DatiAnagraficiVettoreType datiAnagraficiVettore) {
        this.datiAnagraficiVettore = datiAnagraficiVettore;
    }

    public String getMezzoTrasporto() {
        return mezzoTrasporto;
    }

    public void setMezzoTrasporto(String mezzoTrasporto) {
        this.mezzoTrasporto = mezzoTrasporto;
    }

    public String getCausaleTrasporto() {
        return causaleTrasporto;
    }

    public void setCausaleTrasporto(String causaleTrasporto) {
        this.causaleTrasporto = causaleTrasporto;
    }

    public String getNumeroColli() {
        return numeroColli;
    }

    public void setNumeroColli(String numeroColli) {
        this.numeroColli = numeroColli;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getUnitaMisuraPeso() {
        return unitaMisuraPeso;
    }

    public void setUnitaMisuraPeso(String unitaMisuraPeso) {
        this.unitaMisuraPeso = unitaMisuraPeso;
    }

    public String getPesoLordo() {
        return pesoLordo;
    }

    public void setPesoLordo(String pesoLordo) {
        this.pesoLordo = pesoLordo;
    }

    public String getPesoNetto() {
        return pesoNetto;
    }

    public void setPesoNetto(String pesoNetto) {
        this.pesoNetto = pesoNetto;
    }

    public String getDataOraRitiro() {
        return dataOraRitiro;
    }

    public void setDataOraRitiro(String dataOraRitiro) {
        this.dataOraRitiro = dataOraRitiro;
    }

    public String getDataInizioTrasporto() {
        return dataInizioTrasporto;
    }

    public void setDataInizioTrasporto(String dataInizioTrasporto) {
        this.dataInizioTrasporto = dataInizioTrasporto;
    }

    public String getTipoResa() {
        return tipoResa;
    }

    public void setTipoResa(String tipoResa) {
        this.tipoResa = tipoResa;
    }

    public IndirizzoType getIndirizzoResa() {
        return indirizzoResa;
    }

    public void setIndirizzoResa(IndirizzoType indirizzoResa) {
        this.indirizzoResa = indirizzoResa;
    }

    public String getDataOraConsegna() {
        return dataOraConsegna;
    }

    public void setDataOraConsegna(String dataOraConsegna) {
        this.dataOraConsegna = dataOraConsegna;
    }

}
