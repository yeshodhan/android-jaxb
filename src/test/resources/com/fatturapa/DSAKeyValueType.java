
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DSAKeyValueType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DSAKeyValueType")
@Namespace(reference = "http://www.w3.org/2000/09/xmldsig#")
public class DSAKeyValueType {

    @Element(name = "P", required = true)
    private String p;
    @Element(name = "Q", required = true)
    private String q;
    @Element(name = "G", required = false)
    private String g;
    @Element(name = "Y", required = true)
    private String y;
    @Element(name = "J", required = false)
    private String j;
    @Element(name = "Seed", required = true)
    private String seed;
    @Element(name = "PgenCounter", required = true)
    private String pgenCounter;

    public DSAKeyValueType() {
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getPgenCounter() {
        return pgenCounter;
    }

    public void setPgenCounter(String pgenCounter) {
        this.pgenCounter = pgenCounter;
    }

}
