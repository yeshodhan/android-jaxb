
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiCassaPrevidenzialeType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiCassaPrevidenzialeType")
@Namespace(reference = "")
public class DatiCassaPrevidenzialeType {

    @Element(name = "TipoCassa", required = true)
    private TipoCassaType tipoCassa;
    @Element(name = "AlCassa", required = true)
    private String alCassa;
    @Element(name = "ImportoContributoCassa", required = true)
    private String importoContributoCassa;
    @Element(name = "ImponibileCassa", required = false)
    private String imponibileCassa;
    @Element(name = "AliquotaIVA", required = true)
    private String aliquotaIVA;
    @Element(name = "Ritenuta", required = false)
    private RitenutaType ritenuta;
    @Element(name = "Natura", required = false)
    private NaturaType natura;
    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    public DatiCassaPrevidenzialeType() {
    }

    public TipoCassaType getTipoCassa() {
        return tipoCassa;
    }

    public void setTipoCassa(TipoCassaType tipoCassa) {
        this.tipoCassa = tipoCassa;
    }

    public String getAlCassa() {
        return alCassa;
    }

    public void setAlCassa(String alCassa) {
        this.alCassa = alCassa;
    }

    public String getImportoContributoCassa() {
        return importoContributoCassa;
    }

    public void setImportoContributoCassa(String importoContributoCassa) {
        this.importoContributoCassa = importoContributoCassa;
    }

    public String getImponibileCassa() {
        return imponibileCassa;
    }

    public void setImponibileCassa(String imponibileCassa) {
        this.imponibileCassa = imponibileCassa;
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

}
