
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CessionarioCommittenteType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CessionarioCommittenteType")
@Namespace(reference = "")
public class CessionarioCommittenteType {

    @Element(name = "DatiAnagrafici", required = true)
    private DatiAnagraficiCessionarioType datiAnagrafici;
    @Element(name = "Sede", required = true)
    private IndirizzoType sede;
    @Element(name = "StabileOrganizzazione", required = false)
    private IndirizzoType stabileOrganizzazione;
    @Element(name = "RappresentanteFiscale", required = false)
    private RappresentanteFiscaleCessionarioType rappresentanteFiscale;

    public CessionarioCommittenteType() {
    }

    public DatiAnagraficiCessionarioType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    public void setDatiAnagrafici(DatiAnagraficiCessionarioType datiAnagrafici) {
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

    public RappresentanteFiscaleCessionarioType getRappresentanteFiscale() {
        return rappresentanteFiscale;
    }

    public void setRappresentanteFiscale(RappresentanteFiscaleCessionarioType rappresentanteFiscale) {
        this.rappresentanteFiscale = rappresentanteFiscale;
    }

}
