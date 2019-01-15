
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * ContattiTrasmittenteType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "ContattiTrasmittenteType")
@Namespace(reference = "")
public class ContattiTrasmittenteType {

    @Element(name = "Telefono", required = false)
    private String telefono;
    @Element(name = "Email", required = false)
    private String email;

    public ContattiTrasmittenteType() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
