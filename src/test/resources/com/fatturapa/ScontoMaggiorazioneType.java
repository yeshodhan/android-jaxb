
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ScontoMaggiorazioneType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ScontoMaggiorazioneType")
@Namespace(reference = "")
public class ScontoMaggiorazioneType {

    @Element(name = "Tipo", required = true)
    private TipoScontoMaggiorazioneType tipo;
    @Element(name = "Percentuale", required = false)
    private String percentuale;
    @Element(name = "Importo", required = false)
    private String importo;

    public ScontoMaggiorazioneType() {
    }

    public TipoScontoMaggiorazioneType getTipo() {
        return tipo;
    }

    public void setTipo(TipoScontoMaggiorazioneType tipo) {
        this.tipo = tipo;
    }

    public String getPercentuale() {
        return percentuale;
    }

    public void setPercentuale(String percentuale) {
        this.percentuale = percentuale;
    }

    public String getImporto() {
        return importo;
    }

    public void setImporto(String importo) {
        this.importo = importo;
    }

}
