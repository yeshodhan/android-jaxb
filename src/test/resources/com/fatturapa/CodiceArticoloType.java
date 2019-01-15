
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * CodiceArticoloType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "CodiceArticoloType")
@Namespace(reference = "")
public class CodiceArticoloType {

    @Element(name = "CodiceTipo", required = true)
    private String codiceTipo;
    @Element(name = "CodiceValore", required = true)
    private String codiceValore;

    public CodiceArticoloType() {
    }

    public String getCodiceTipo() {
        return codiceTipo;
    }

    public void setCodiceTipo(String codiceTipo) {
        this.codiceTipo = codiceTipo;
    }

    public String getCodiceValore() {
        return codiceValore;
    }

    public void setCodiceValore(String codiceValore) {
        this.codiceValore = codiceValore;
    }

}
