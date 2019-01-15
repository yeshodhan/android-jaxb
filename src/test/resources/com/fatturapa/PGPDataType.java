
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * PGPDataType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "PGPDataType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class PGPDataType {

    @Element(name = "PGPKeyID", required = true)
    private String pgpKeyID;
    @Element(name = "PGPKeyPacket", required = false)
    private String pgpKeyPacket;

    public PGPDataType() {
    }

    public String getPgpKeyID() {
        return pgpKeyID;
    }

    public void setPgpKeyID(String pgpKeyID) {
        this.pgpKeyID = pgpKeyID;
    }

    public String getPgpKeyPacket() {
        return pgpKeyPacket;
    }

    public void setPgpKeyPacket(String pgpKeyPacket) {
        this.pgpKeyPacket = pgpKeyPacket;
    }

}
