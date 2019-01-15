
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * FatturaElettronica<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "FatturaElettronica")
@Namespace(reference = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2")
public class FatturaElettronica {

    @Element(name = "FatturaElettronicaHeader", required = true)
    private FatturaElettronicaHeaderType fatturaElettronicaHeader;
    @ElementList(name = "FatturaElettronicaBody", entry = "FatturaElettronicaBody", inline = true, required = true)
    private List<FatturaElettronicaBodyType> fatturaElettronicaBody;
    @Element(name = "Signature", required = false)
    private SignatureType signature;
    @Attribute(name = "versione", required = true)
    private FormatoTrasmissioneType versione;

    public FatturaElettronica() {
    }

    public FatturaElettronicaHeaderType getFatturaElettronicaHeader() {
        return fatturaElettronicaHeader;
    }

    public void setFatturaElettronicaHeader(FatturaElettronicaHeaderType fatturaElettronicaHeader) {
        this.fatturaElettronicaHeader = fatturaElettronicaHeader;
    }

    public List<FatturaElettronicaBodyType> getFatturaElettronicaBody() {
        return fatturaElettronicaBody;
    }

    public void setFatturaElettronicaBody(List<FatturaElettronicaBodyType> fatturaElettronicaBody) {
        this.fatturaElettronicaBody = fatturaElettronicaBody;
    }

    public SignatureType getSignature() {
        return signature;
    }

    public void setSignature(SignatureType signature) {
        this.signature = signature;
    }

    public FormatoTrasmissioneType getVersione() {
        return versione;
    }

    public void setVersione(FormatoTrasmissioneType versione) {
        this.versione = versione;
    }

}
