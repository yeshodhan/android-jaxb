
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiAnagraficiCedenteType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiAnagraficiCedenteType")
@Namespace(reference = "")
public class DatiAnagraficiCedenteType {

    @Element(name = "IdFiscaleIVA", required = true)
    private IdFiscaleType idFiscaleIVA;
    @Element(name = "CodiceFiscale", required = false)
    private String codiceFiscale;
    @Element(name = "Anagrafica", required = true)
    private AnagraficaType anagrafica;
    @Element(name = "AlboProfessionale", required = false)
    private String alboProfessionale;
    @Element(name = "ProvinciaAlbo", required = false)
    private String provinciaAlbo;
    @Element(name = "NumeroIscrizioneAlbo", required = false)
    private String numeroIscrizioneAlbo;
    @Element(name = "DataIscrizioneAlbo", required = false)
    private String dataIscrizioneAlbo;
    @Element(name = "RegimeFiscale", required = true)
    private RegimeFiscaleType regimeFiscale;

    public DatiAnagraficiCedenteType() {
    }

    public IdFiscaleType getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    public void setIdFiscaleIVA(IdFiscaleType idFiscaleIVA) {
        this.idFiscaleIVA = idFiscaleIVA;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public AnagraficaType getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(AnagraficaType anagrafica) {
        this.anagrafica = anagrafica;
    }

    public String getAlboProfessionale() {
        return alboProfessionale;
    }

    public void setAlboProfessionale(String alboProfessionale) {
        this.alboProfessionale = alboProfessionale;
    }

    public String getProvinciaAlbo() {
        return provinciaAlbo;
    }

    public void setProvinciaAlbo(String provinciaAlbo) {
        this.provinciaAlbo = provinciaAlbo;
    }

    public String getNumeroIscrizioneAlbo() {
        return numeroIscrizioneAlbo;
    }

    public void setNumeroIscrizioneAlbo(String numeroIscrizioneAlbo) {
        this.numeroIscrizioneAlbo = numeroIscrizioneAlbo;
    }

    public String getDataIscrizioneAlbo() {
        return dataIscrizioneAlbo;
    }

    public void setDataIscrizioneAlbo(String dataIscrizioneAlbo) {
        this.dataIscrizioneAlbo = dataIscrizioneAlbo;
    }

    public RegimeFiscaleType getRegimeFiscale() {
        return regimeFiscale;
    }

    public void setRegimeFiscale(RegimeFiscaleType regimeFiscale) {
        this.regimeFiscale = regimeFiscale;
    }

}
