
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CedentePrestatoreType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CedentePrestatoreType")
@Namespace(reference = "")
public class CedentePrestatoreType {

    @Element(name = "DatiAnagrafici", required = true)
    private DatiAnagraficiCedenteType datiAnagrafici;
    @Element(name = "Sede", required = true)
    private IndirizzoType sede;
    @Element(name = "StabileOrganizzazione", required = false)
    private IndirizzoType stabileOrganizzazione;
    @Element(name = "IscrizioneREA", required = false)
    private IscrizioneREAType iscrizioneREA;
    @Element(name = "Contatti", required = false)
    private ContattiType contatti;
    @Element(name = "RiferimentoAmministrazione", required = false)
    private String riferimentoAmministrazione;

    public CedentePrestatoreType() {
    }

    public DatiAnagraficiCedenteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(DatiAnagraficiCedenteType datiAnagrafici) {
        this.datiAnagrafici = datiAnagrafici;
    }

    public IndirizzoType getSede() {
        return sede;
    }

    public void setSede(IndirizzoType sede) {
        this.sede = sede;
    }

    public IndirizzoType getStabileOrganizzazione() {
        return stabileOrganizzazione;
    }

    public void setStabileOrganizzazione(IndirizzoType stabileOrganizzazione) {
        this.stabileOrganizzazione = stabileOrganizzazione;
    }

    public IscrizioneREAType getIscrizioneREA() {
        return iscrizioneREA;
    }

    public void setIscrizioneREA(IscrizioneREAType iscrizioneREA) {
        this.iscrizioneREA = iscrizioneREA;
    }

    public ContattiType getContatti() {
        return contatti;
    }

    public void setContatti(ContattiType contatti) {
        this.contatti = contatti;
    }

    public String getRiferimentoAmministrazione() {
        return riferimentoAmministrazione;
    }

    public void setRiferimentoAmministrazione(String riferimentoAmministrazione) {
        this.riferimentoAmministrazione = riferimentoAmministrazione;
    }

}
