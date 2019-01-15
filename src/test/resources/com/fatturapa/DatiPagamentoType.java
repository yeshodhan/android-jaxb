
package com.fatturapa;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiPagamentoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiPagamentoType")
@Namespace(reference = "")
public class DatiPagamentoType {

    @Element(name = "CondizioniPagamento", required = true)
    private CondizioniPagamentoType condizioniPagamento;
    @ElementList(name = "DettaglioPagamento", entry = "DettaglioPagamento", inline = true, required = true)
    private List<DettaglioPagamentoType> dettaglioPagamento;

    public DatiPagamentoType() {
    }

    public CondizioniPagamentoType getCondizioniPagamento() {
        return condizioniPagamento;
    }

    public void setCondizioniPagamento(CondizioniPagamentoType condizioniPagamento) {
        this.condizioniPagamento = condizioniPagamento;
    }

    public List<DettaglioPagamentoType> getDettaglioPagamento() {
        return dettaglioPagamento;
    }

    public void setDettaglioPagamento(List<DettaglioPagamentoType> dettaglioPagamento) {
        this.dettaglioPagamento = dettaglioPagamento;
    }

}
