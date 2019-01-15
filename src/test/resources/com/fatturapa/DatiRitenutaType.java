
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiRitenutaType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiRitenutaType")
@Namespace(reference = "")
public class DatiRitenutaType {

    @Element(name = "TipoRitenuta", required = true)
    private TipoRitenutaType tipoRitenuta;
    @Element(name = "ImportoRitenuta", required = true)
    private String importoRitenuta;
    @Element(name = "AliquotaRitenuta", required = true)
    private String aliquotaRitenuta;
    @Element(name = "CausalePagamento", required = true)
    private CausalePagamentoType causalePagamento;

    public DatiRitenutaType() {
    }

    public TipoRitenutaType getTipoRitenuta() {
        return tipoRitenuta;
    }

    public void setTipoRitenuta(TipoRitenutaType tipoRitenuta) {
        this.tipoRitenuta = tipoRitenuta;
    }

    public String getImportoRitenuta() {
        return importoRitenuta;
    }

    public void setImportoRitenuta(String importoRitenuta) {
        this.importoRitenuta = importoRitenuta;
    }

    public String getAliquotaRitenuta() {
        return aliquotaRitenuta;
    }

    public void setAliquotaRitenuta(String aliquotaRitenuta) {
        this.aliquotaRitenuta = aliquotaRitenuta;
    }

    public CausalePagamentoType getCausalePagamento() {
        return causalePagamento;
    }

    public void setCausalePagamento(CausalePagamentoType causalePagamento) {
        this.causalePagamento = causalePagamento;
    }

}
