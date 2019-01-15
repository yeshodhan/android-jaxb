
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiVeicoliType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiVeicoliType")
@Namespace(reference = "")
public class DatiVeicoliType {

    @Element(name = "Data", required = true)
    private String data;
    @Element(name = "TotalePercorso", required = true)
    private String totalePercorso;

    public DatiVeicoliType() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTotalePercorso() {
        return totalePercorso;
    }

    public void setTotalePercorso(String totalePercorso) {
        this.totalePercorso = totalePercorso;
    }

}
