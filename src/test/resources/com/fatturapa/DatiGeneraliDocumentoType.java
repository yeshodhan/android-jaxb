
package com.fatturapa;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiGeneraliDocumentoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiGeneraliDocumentoType")
@Namespace(reference = "")
public class DatiGeneraliDocumentoType {

    @Element(name = "TipoDocumento", required = true)
    private TipoDocumentoType tipoDocumento;
    @Element(name = "Divisa", required = true)
    private String divisa;
    @Element(name = "Data", required = true)
    private String data;
    @Element(name = "Numero", required = true)
    private String numero;
    @Element(name = "DatiRitenuta", required = false)
    private DatiRitenutaType datiRitenuta;
    @Element(name = "DatiBollo", required = false)
    private DatiBolloType datiBollo;
    @ElementList(name = "DatiCassaPrevidenziale", entry = "DatiCassaPrevidenziale", inline = true, required = false)
    private List<DatiCassaPrevidenzialeType> datiCassaPrevidenziale;
    @ElementList(name = "ScontoMaggiorazione", entry = "ScontoMaggiorazione", inline = true, required = false)
    private List<ScontoMaggiorazioneType> scontoMaggiorazione;
    @Element(name = "ImportoTotaleDocumento", required = false)
    private String importoTotaleDocumento;
    @Element(name = "Arrotondamento", required = false)
    private String arrotondamento;
    @ElementList(name = "Causale", entry = "Causale", inline = true, required = false)
    private List<String> causale;
    @Element(name = "Art73", required = false)
    private Art73Type art73;

    public DatiGeneraliDocumentoType() {
    }

    public TipoDocumentoType getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoType tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DatiRitenutaType getDatiRitenuta() {
        return datiRitenuta;
    }

    public void setDatiRitenuta(DatiRitenutaType datiRitenuta) {
        this.datiRitenuta = datiRitenuta;
    }

    public DatiBolloType getDatiBollo() {
        return datiBollo;
    }

    public void setDatiBollo(DatiBolloType datiBollo) {
        this.datiBollo = datiBollo;
    }

    public List<DatiCassaPrevidenzialeType> getDatiCassaPrevidenziale() {
        return datiCassaPrevidenziale;
    }

    public void setDatiCassaPrevidenziale(List<DatiCassaPrevidenzialeType> datiCassaPrevidenziale) {
        this.datiCassaPrevidenziale = datiCassaPrevidenziale;
    }

    public List<ScontoMaggiorazioneType> getScontoMaggiorazione() {
        return scontoMaggiorazione;
    }

    public void setScontoMaggiorazione(List<ScontoMaggiorazioneType> scontoMaggiorazione) {
        this.scontoMaggiorazione = scontoMaggiorazione;
    }

    public String getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    public void setImportoTotaleDocumento(String importoTotaleDocumento) {
        this.importoTotaleDocumento = importoTotaleDocumento;
    }

    public String getArrotondamento() {
        return arrotondamento;
    }

    public void setArrotondamento(String arrotondamento) {
        this.arrotondamento = arrotondamento;
    }

    public List<String> getCausale() {
        return causale;
    }

    public void setCausale(List<String> causale) {
        this.causale = causale;
    }

    public Art73Type getArt73() {
        return art73;
    }

    public void setArt73(Art73Type art73) {
        this.art73 = art73;
    }

}
