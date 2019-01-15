
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * DatiDDTType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DatiDDTType")
@Namespace(reference = "")
public class DatiDDTType {

    @Element(name = "NumeroDDT", required = true)
    private String numeroDDT;
    @Element(name = "DataDDT", required = true)
    private String dataDDT;
    @ElementList(name = "RiferimentoNumeroLinea", entry = "RiferimentoNumeroLinea", inline = true, required = false)
    private List<String> riferimentoNumeroLinea;

    public DatiDDTType() {
    }

    public String getNumeroDDT() {
        return numeroDDT;
    }

    public void setNumeroDDT(String numeroDDT) {
        this.numeroDDT = numeroDDT;
    }

    public String getDataDDT() {
        return dataDDT;
    }

    public void setDataDDT(String dataDDT) {
        this.dataDDT = dataDDT;
    }

    public List<String> getRiferimentoNumeroLinea() {
        return riferimentoNumeroLinea;
    }

    public void setRiferimentoNumeroLinea(List<String> riferimentoNumeroLinea) {
        this.riferimentoNumeroLinea = riferimentoNumeroLinea;
    }

}
