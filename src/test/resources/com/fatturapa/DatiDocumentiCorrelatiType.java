
package com.fatturapa;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiDocumentiCorrelatiType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiDocumentiCorrelatiType")
@Namespace(reference = "")
public class DatiDocumentiCorrelatiType {

    @ElementList(name = "RiferimentoNumeroLinea", entry = "RiferimentoNumeroLinea", inline = true, required = false)
    private List<String> riferimentoNumeroLinea;
    @Element(name = "IdDocumento", required = true)
    private String idDocumento;
    @Element(name = "Data", required = false)
    private String data;
    @Element(name = "NumItem", required = false)
    private String numItem;
    @Element(name = "CodiceCommessaConvenzione", required = false)
    private String codiceCommessaConvenzione;
    @Element(name = "CodiceCUP", required = false)
    private String codiceCUP;
    @Element(name = "CodiceCIG", required = false)
    private String codiceCIG;

    public DatiDocumentiCorrelatiType() {
    }

    public List<String> getRiferimentoNumeroLinea() {
        return riferimentoNumeroLinea;
    }

    public void setRiferimentoNumeroLinea(List<String> riferimentoNumeroLinea) {
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumItem() {
        return numItem;
    }

    public void setNumItem(String numItem) {
        this.numItem = numItem;
    }

    public String getCodiceCommessaConvenzione() {
        return codiceCommessaConvenzione;
    }

    public void setCodiceCommessaConvenzione(String codiceCommessaConvenzione) {
        this.codiceCommessaConvenzione = codiceCommessaConvenzione;
    }

    public String getCodiceCUP() {
        return codiceCUP;
    }

    public void setCodiceCUP(String codiceCUP) {
        this.codiceCUP = codiceCUP;
    }

    public String getCodiceCIG() {
        return codiceCIG;
    }

    public void setCodiceCIG(String codiceCIG) {
        this.codiceCIG = codiceCIG;
    }

}
