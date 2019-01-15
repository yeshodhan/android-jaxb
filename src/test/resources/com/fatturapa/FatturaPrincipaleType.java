
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * FatturaPrincipaleType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "FatturaPrincipaleType")
@Namespace(reference = "")
public class FatturaPrincipaleType {

    @Element(name = "NumeroFatturaPrincipale", required = true)
    private String numeroFatturaPrincipale;
    @Element(name = "DataFatturaPrincipale", required = true)
    private String dataFatturaPrincipale;

    public FatturaPrincipaleType() {
    }

    public String getNumeroFatturaPrincipale() {
        return numeroFatturaPrincipale;
    }

    public void setNumeroFatturaPrincipale(String numeroFatturaPrincipale) {
        this.numeroFatturaPrincipale = numeroFatturaPrincipale;
    }

    public String getDataFatturaPrincipale() {
        return dataFatturaPrincipale;
    }

    public void setDataFatturaPrincipale(String dataFatturaPrincipale) {
        this.dataFatturaPrincipale = dataFatturaPrincipale;
    }

}
