
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DatiBolloType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiBolloType")
@Namespace(reference = "")
public class DatiBolloType {

    @Element(name = "BolloVirtuale", required = true)
    private BolloVirtualeType bolloVirtuale;
    @Element(name = "ImportoBollo", required = true)
    private String importoBollo;

    public DatiBolloType() {
    }

    public BolloVirtualeType getBolloVirtuale() {
        return bolloVirtuale;
    }

    public void setBolloVirtuale(BolloVirtualeType bolloVirtuale) {
        this.bolloVirtuale = bolloVirtuale;
    }

    public String getImportoBollo() {
        return importoBollo;
    }

    public void setImportoBollo(String importoBollo) {
        this.importoBollo = importoBollo;
    }

}
