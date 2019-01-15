
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * FatturaElettronicaBodyType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "FatturaElettronicaBodyType")
@Namespace(reference = "")
public class FatturaElettronicaBodyType {

    @Element(name = "DatiGenerali", required = true)
    private DatiGeneraliType datiGenerali;
    @Element(name = "DatiBeniServizi", required = true)
    private DatiBeniServiziType datiBeniServizi;
    @Element(name = "DatiVeicoli", required = false)
    private DatiVeicoliType datiVeicoli;
    @ElementList(name = "DatiPagamento", entry = "DatiPagamento", inline = true, required = false)
    private List<DatiPagamentoType> datiPagamento;
    @ElementList(name = "Allegati", entry = "Allegati", inline = true, required = false)
    private List<AllegatiType> allegati;

    public FatturaElettronicaBodyType() {
    }

    public DatiGeneraliType getDatiGenerali() {
        return datiGenerali;
    }

    public void setDatiGenerali(DatiGeneraliType datiGenerali) {
        this.datiGenerali = datiGenerali;
    }

    public DatiBeniServiziType getDatiBeniServizi() {
        return datiBeniServizi;
    }

    public void setDatiBeniServizi(DatiBeniServiziType datiBeniServizi) {
        this.datiBeniServizi = datiBeniServizi;
    }

    public DatiVeicoliType getDatiVeicoli() {
        return datiVeicoli;
    }

    public void setDatiVeicoli(DatiVeicoliType datiVeicoli) {
        this.datiVeicoli = datiVeicoli;
    }

    public List<DatiPagamentoType> getDatiPagamento() {
        return datiPagamento;
    }

    public void setDatiPagamento(List<DatiPagamentoType> datiPagamento) {
        this.datiPagamento = datiPagamento;
    }

    public List<AllegatiType> getAllegati() {
        return allegati;
    }

    public void setAllegati(List<AllegatiType> allegati) {
        this.allegati = allegati;
    }

}
