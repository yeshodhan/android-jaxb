
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * IscrizioneREAType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "IscrizioneREAType")
@Namespace(reference = "")
public class IscrizioneREAType {

    @Element(name = "Ufficio", required = true)
    private String ufficio;
    @Element(name = "NumeroREA", required = true)
    private String numeroREA;
    @Element(name = "CapitaleSociale", required = false)
    private String capitaleSociale;
    @Element(name = "SocioUnico", required = false)
    private SocioUnicoType socioUnico;
    @Element(name = "StatoLiquidazione", required = true)
    private StatoLiquidazioneType statoLiquidazione;

    public IscrizioneREAType() {
    }

    public String getUfficio() {
        return ufficio;
    }

    public void setUfficio(String ufficio) {
        this.ufficio = ufficio;
    }

    public String getNumeroREA() {
        return numeroREA;
    }

    public void setNumeroREA(String numeroREA) {
        this.numeroREA = numeroREA;
    }

    public String getCapitaleSociale() {
        return capitaleSociale;
    }

    public void setCapitaleSociale(String capitaleSociale) {
        this.capitaleSociale = capitaleSociale;
    }

    public SocioUnicoType getSocioUnico() {
        return socioUnico;
    }

    public void setSocioUnico(SocioUnicoType socioUnico) {
        this.socioUnico = socioUnico;
    }

    public StatoLiquidazioneType getStatoLiquidazione() {
        return statoLiquidazione;
    }

    public void setStatoLiquidazione(StatoLiquidazioneType statoLiquidazione) {
        this.statoLiquidazione = statoLiquidazione;
    }

}
