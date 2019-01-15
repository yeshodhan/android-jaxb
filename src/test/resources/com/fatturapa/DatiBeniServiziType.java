
package com.fatturapa;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiBeniServiziType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiBeniServiziType")
@Namespace(reference = "")
public class DatiBeniServiziType {

    @ElementList(name = "DettaglioLinee", entry = "DettaglioLinee", inline = true, required = true)
    private List<DettaglioLineeType> dettaglioLinee;
    @ElementList(name = "DatiRiepilogo", entry = "DatiRiepilogo", inline = true, required = true)
    private List<DatiRiepilogoType> datiRiepilogo;

    public DatiBeniServiziType() {
    }

    public List<DettaglioLineeType> getDettaglioLinee() {
        return dettaglioLinee;
    }

    public void setDettaglioLinee(List<DettaglioLineeType> dettaglioLinee) {
        this.dettaglioLinee = dettaglioLinee;
    }

    public List<DatiRiepilogoType> getDatiRiepilogo() {
        return datiRiepilogo;
    }

    public void setDatiRiepilogo(List<DatiRiepilogoType> datiRiepilogo) {
        this.datiRiepilogo = datiRiepilogo;
    }

}
