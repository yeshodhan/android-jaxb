
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * AllegatiType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "AllegatiType")
@Namespace(reference = "")
public class AllegatiType {

    @Element(name = "NomeAttachment", required = true)
    private String nomeAttachment;
    @Element(name = "AlgoritmoCompressione", required = false)
    private String algoritmoCompressione;
    @Element(name = "FormatoAttachment", required = false)
    private String formatoAttachment;
    @Element(name = "DescrizioneAttachment", required = false)
    private String descrizioneAttachment;
    @Element(name = "Attachment", required = true)
    private String attachment;

    public AllegatiType() {
    }

    public String getNomeAttachment() {
        return nomeAttachment;
    }

    public void setNomeAttachment(String nomeAttachment) {
        this.nomeAttachment = nomeAttachment;
    }

    public String getAlgoritmoCompressione() {
        return algoritmoCompressione;
    }

    public void setAlgoritmoCompressione(String algoritmoCompressione) {
        this.algoritmoCompressione = algoritmoCompressione;
    }

    public String getFormatoAttachment() {
        return formatoAttachment;
    }

    public void setFormatoAttachment(String formatoAttachment) {
        this.formatoAttachment = formatoAttachment;
    }

    public String getDescrizioneAttachment() {
        return descrizioneAttachment;
    }

    public void setDescrizioneAttachment(String descrizioneAttachment) {
        this.descrizioneAttachment = descrizioneAttachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

}
