
package com.fatturapa;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * KeyInfoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "KeyInfoType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class KeyInfoType {

    @Element(name = "KeyName", required = true)
    private String keyName;
    @Element(name = "KeyValue", required = true)
    private KeyValueType keyValue;
    @Element(name = "RetrievalMethod", required = true)
    private RetrievalMethodType retrievalMethod;
    @Element(name = "X509Data", required = true)
    private X509DataType x509Data;
    @Element(name = "PGPData", required = true)
    private PGPDataType pgpData;
    @Element(name = "SPKIData", required = true)
    private SPKIDataType spkiData;
    @Element(name = "MgmtData", required = true)
    private String mgmtData;
    @Attribute(name = "Id", required = false)
    private String id;

    public KeyInfoType() {
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public KeyValueType getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(KeyValueType keyValue) {
        this.keyValue = keyValue;
    }

    public RetrievalMethodType getRetrievalMethod() {
        return retrievalMethod;
    }

    public void setRetrievalMethod(RetrievalMethodType retrievalMethod) {
        this.retrievalMethod = retrievalMethod;
    }

    public X509DataType getX509Data() {
        return x509Data;
    }

    public void setX509Data(X509DataType x509Data) {
        this.x509Data = x509Data;
    }

    public PGPDataType getPgpData() {
        return pgpData;
    }

    public void setPgpData(PGPDataType pgpData) {
        this.pgpData = pgpData;
    }

    public SPKIDataType getSpkiData() {
        return spkiData;
    }

    public void setSpkiData(SPKIDataType spkiData) {
        this.spkiData = spkiData;
    }

    public String getMgmtData() {
        return mgmtData;
    }

    public void setMgmtData(String mgmtData) {
        this.mgmtData = mgmtData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
