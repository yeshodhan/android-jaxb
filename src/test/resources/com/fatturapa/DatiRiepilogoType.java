
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiRiepilogoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiRiepilogoType")
@Namespace(reference = "")
public class DatiRiepilogoType {

    @Element(name = "AliquotaIVA", required = true)
    private String aliquotaIVA;
    @Element(name = "Natura", required = false)
    private NaturaType natura;
    @Element(name = "SpeseAccessorie", required = false)
    private String speseAccessorie;
    @Element(name = "Arrotondamento", required = false)
    private String arrotondamento;
    @Element(name = "ImponibileImporto", required = true)
    private String imponibileImporto;
    @Element(name = "Imposta", required = true)
    private String imposta;
    @Element(name = "EsigibilitaIVA", required = false)
    private EsigibilitaIVAType esigibilitaIVA;
    @Element(name = "RiferimentoNormativo", required = false)
    private String riferimentoNormativo;

    public DatiRiepilogoType() {
    }

    public String getAliquotaIVA() {
        return aliquotaIVA;
    }

    public void setAliquotaIVA(String aliquotaIVA) {
        this.aliquotaIVA = aliquotaIVA;
    }

    public NaturaType getNatura() {
        return natura;
    }

    public void setNatura(NaturaType natura) {
        this.natura = natura;
    }

    public String getSpeseAccessorie() {
        return speseAccessorie;
    }

    public void setSpeseAccessorie(String speseAccessorie) {
        this.speseAccessorie = speseAccessorie;
    }

    public String getArrotondamento() {
        return arrotondamento;
    }

    public void setArrotondamento(String arrotondamento) {
        this.arrotondamento = arrotondamento;
    }

    public String getImponibileImporto() {
        return imponibileImporto;
    }

    public void setImponibileImporto(String imponibileImporto) {
        this.imponibileImporto = imponibileImporto;
    }

    public String getImposta() {
        return imposta;
    }

    public void setImposta(String imposta) {
        this.imposta = imposta;
    }

    public EsigibilitaIVAType getEsigibilitaIVA() {
        return esigibilitaIVA;
    }

    public void setEsigibilitaIVA(EsigibilitaIVAType esigibilitaIVA) {
        this.esigibilitaIVA = esigibilitaIVA;
    }

    public String getRiferimentoNormativo() {
        return riferimentoNormativo;
    }

    public void setRiferimentoNormativo(String riferimentoNormativo) {
        this.riferimentoNormativo = riferimentoNormativo;
    }

}
