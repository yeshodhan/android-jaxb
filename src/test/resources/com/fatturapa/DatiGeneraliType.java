
package com.fatturapa;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiGeneraliType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiGeneraliType")
@Namespace(reference = "")
public class DatiGeneraliType {

    @Element(name = "DatiGeneraliDocumento", required = true)
    private DatiGeneraliDocumentoType datiGeneraliDocumento;
    @ElementList(name = "DatiOrdineAcquisto", entry = "DatiOrdineAcquisto", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiOrdineAcquisto;
    @ElementList(name = "DatiContratto", entry = "DatiContratto", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiContratto;
    @ElementList(name = "DatiConvenzione", entry = "DatiConvenzione", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiConvenzione;
    @ElementList(name = "DatiRicezione", entry = "DatiRicezione", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiRicezione;
    @ElementList(name = "DatiFattureCollegate", entry = "DatiFattureCollegate", inline = true, required = false)
    private List<DatiDocumentiCorrelatiType> datiFattureCollegate;
    @ElementList(name = "DatiSAL", entry = "DatiSAL", inline = true, required = false)
    private List<DatiSALType> datiSAL;
    @ElementList(name = "DatiDDT", entry = "DatiDDT", inline = true, required = false)
    private List<DatiDDTType> datiDDT;
    @Element(name = "DatiTrasporto", required = false)
    private DatiTrasportoType datiTrasporto;
    @Element(name = "FatturaPrincipale", required = false)
    private FatturaPrincipaleType fatturaPrincipale;

    public DatiGeneraliType() {
    }

    public DatiGeneraliDocumentoType getDatiGeneraliDocumento() {
        return datiGeneraliDocumento;
    }

    public void setDatiGeneraliDocumento(DatiGeneraliDocumentoType datiGeneraliDocumento) {
        this.datiGeneraliDocumento = datiGeneraliDocumento;
    }

    public List<DatiDocumentiCorrelatiType> getDatiOrdineAcquisto() {
        return datiOrdineAcquisto;
    }

    public void setDatiOrdineAcquisto(List<DatiDocumentiCorrelatiType> datiOrdineAcquisto) {
        this.datiOrdineAcquisto = datiOrdineAcquisto;
    }

    public List<DatiDocumentiCorrelatiType> getDatiContratto() {
        return datiContratto;
    }

    public void setDatiContratto(List<DatiDocumentiCorrelatiType> datiContratto) {
        this.datiContratto = datiContratto;
    }

    public List<DatiDocumentiCorrelatiType> getDatiConvenzione() {
        return datiConvenzione;
    }

    public void setDatiConvenzione(List<DatiDocumentiCorrelatiType> datiConvenzione) {
        this.datiConvenzione = datiConvenzione;
    }

    public List<DatiDocumentiCorrelatiType> getDatiRicezione() {
        return datiRicezione;
    }

    public void setDatiRicezione(List<DatiDocumentiCorrelatiType> datiRicezione) {
        this.datiRicezione = datiRicezione;
    }

    public List<DatiDocumentiCorrelatiType> getDatiFattureCollegate() {
        return datiFattureCollegate;
    }

    public void setDatiFattureCollegate(List<DatiDocumentiCorrelatiType> datiFattureCollegate) {
        this.datiFattureCollegate = datiFattureCollegate;
    }

    public List<DatiSALType> getDatiSAL() {
        return datiSAL;
    }

    public void setDatiSAL(List<DatiSALType> datiSAL) {
        this.datiSAL = datiSAL;
    }

    public List<DatiDDTType> getDatiDDT() {
        return datiDDT;
    }

    public void setDatiDDT(List<DatiDDTType> datiDDT) {
        this.datiDDT = datiDDT;
    }

    public DatiTrasportoType getDatiTrasporto() {
        return datiTrasporto;
    }

    public void setDatiTrasporto(DatiTrasportoType datiTrasporto) {
        this.datiTrasporto = datiTrasporto;
    }

    public FatturaPrincipaleType getFatturaPrincipale() {
        return fatturaPrincipale;
    }

    public void setFatturaPrincipale(FatturaPrincipaleType fatturaPrincipale) {
        this.fatturaPrincipale = fatturaPrincipale;
    }

}
