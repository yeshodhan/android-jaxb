
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * IdFiscaleType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "IdFiscaleType")
@Namespace(reference = "")
public class IdFiscaleType {

    @Element(name = "IdPaese", required = true)
    private String idPaese;
    @Element(name = "IdCodice", required = true)
    private String idCodice;

    public IdFiscaleType() {
    }

    public String getIdPaese() {
        return idPaese;
    }

    public void setIdPaese(String idPaese) {
        this.idPaese = idPaese;
    }

    public String getIdCodice() {
        return idCodice;
    }

    public void setIdCodice(String idCodice) {
        this.idCodice = idCodice;
    }

}
