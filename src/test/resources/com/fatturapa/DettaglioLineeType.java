
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * DettaglioLineeType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DettaglioLineeType")
@Namespace(reference = "")
public class DettaglioLineeType {

    @Element(name = "NumeroLinea", required = true)
    private String numeroLinea;
    @Element(name = "TipoCessionePrestazione", required = false)
    private TipoCessionePrestazioneType tipoCessionePrestazione;
    @ElementList(name = "CodiceArticolo", entry = "CodiceArticolo", inline = true, required = false)
    private List<CodiceArticoloType> codiceArticolo;
    @Element(name = "Descrizione", required = true)
    private String descrizione;
    @Element(name = "Quantita", required = false)
    private String quantita;
    @Element(name = "UnitaMisura", required = false)
    private String unitaMisura;
    @Element(name = "DataInizioPeriodo", required = false)
    private String dataInizioPeriodo;
    @Element(name = "DataFinePeriodo", required = false)
    private String dataFinePeriodo;
    @Element(name = "PrezzoUnitario", required = true)
    private String prezzoUnitario;
    @ElementList(name = "ScontoMaggiorazione", entry = "ScontoMaggiorazione", inline = true, required = false)
    private List<ScontoMaggiorazioneType> scontoMaggiorazione;
    @Element(name = "PrezzoTotale", required = true)
    private String prezzoTotale;
    @Element(name = "AliquotaIVA", required = true)
    private String aliquotaIVA;
    @Element(name = "Ritenuta", required = false)
    private RitenutaType ritenuta;
    @Element(name = "Natura", required = false)
    private NaturaType natura;
    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;
    @ElementList(name = "AltriDatiGestionali", entry = "AltriDatiGestionali", inline = true, required = false)
    private List<AltriDatiGestionaliType> altriDatiGestionali;

    public DettaglioLineeType() {
    }

    public String getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(String numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public TipoCessionePrestazioneType getTipoCessionePrestazione() {
        return tipoCessionePrestazione;
    }

    public void setTipoCessionePrestazione(TipoCessionePrestazioneType tipoCessionePrestazione) {
        this.tipoCessionePrestazione = tipoCessionePrestazione;
    }

    public List<CodiceArticoloType> getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(List<CodiceArticoloType> codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    public String getDataInizioPeriodo() {
        return dataInizioPeriodo;
    }

    public void setDataInizioPeriodo(String dataInizioPeriodo) {
        this.dataInizioPeriodo = dataInizioPeriodo;
    }

    public String getDataFinePeriodo() {
        return dataFinePeriodo;
    }

    public void setDataFinePeriodo(String dataFinePeriodo) {
        this.dataFinePeriodo = dataFinePeriodo;
    }

    public String getPrezzoUnitario() {
        return prezzoUnitario;
    }

    public void setPrezzoUnitario(String prezzoUnitario) {
        this.prezzoUnitario = prezzoUnitario;
    }

    public List<ScontoMaggiorazioneType> getScontoMaggiorazione() {
        return scontoMaggiorazione;
    }

    public void setScontoMaggiorazione(List<ScontoMaggiorazioneType> scontoMaggiorazione) {
        this.scontoMaggiorazione = scontoMaggiorazione;
    }

    public String getPrezzoTotale() {
        return prezzoTotale;
    }

    public void setPrezzoTotale(String prezzoTotale) {
        this.prezzoTotale = prezzoTotale;
    }

    public String getAliquotaIVA() {
        return aliquotaIVA;
    }

    public void setAliquotaIVA(String aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public RitenutaType getRitenuta() {
        return ritenuta;
    }

    public void setRitenuta(RitenutaType ritenuta) {
        this.ritenuta = ritenuta;
    }

    public NaturaType getNatura() {
        return natura;
    }

    public void setNatura(NaturaType natura) {
        this.natura = natura;
    }

    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    public void setRiferimentoAmministrazione(String riferimentoAmministrazione) {
        this.riferimentoAmministrazione = riferimentoAmministrazione;
    }

    public List<AltriDatiGestionaliType> getAltriDatiGestionali() {
        return altriDatiGestionali;
    }

    public void setAltriDatiGestionali(List<AltriDatiGestionaliType> altriDatiGestionali) {
        this.altriDatiGestionali = altriDatiGestionali;
    }

}
