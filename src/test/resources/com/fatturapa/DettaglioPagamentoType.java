
package com.fatturapa;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;


/**
 * DettaglioPagamentoType<br>
 * Generated using Android JAXB<br>
 * @link https://github.com/yeshodhan/android-jaxb
 * 
 */
@Root(name = "DettaglioPagamentoType")
@Namespace(reference = "")
public class DettaglioPagamentoType {

    @Element(name = "Beneficiario", required = false)
    private String beneficiario;
    @Element(name = "ModalitaPagamento", required = true)
    private ModalitaPagamentoType modalitaPagamento;
    @Element(name = "DataRiferimentoTerminiPagamento", required = false)
    private String dataRiferimentoTerminiPagamento;
    @Element(name = "GiorniTerminiPagamento", required = false)
    private String giorniTerminiPagamento;
    @Element(name = "DataScadenzaPagamento", required = false)
    private String dataScadenzaPagamento;
    @Element(name = "ImportoPagamento", required = true)
    private String importoPagamento;
    @Element(name = "CodUfficioPostale", required = false)
    private String codUfficioPostale;
    @Element(name = "CognomeQuietanzante", required = false)
    private String cognomeQuietanzante;
    @Element(name = "NomeQuietanzante", required = false)
    private String nomeQuietanzante;
    @Element(name = "CFQuietanzante", required = false)
    private String cfQuietanzante;
    @Element(name = "TitoloQuietanzante", required = false)
    private String titoloQuietanzante;
    @Element(name = "IstitutoFinanziario", required = false)
    private String istitutoFinanziario;
    @Element(name = "IBAN", required = false)
    private String iban;
    @Element(name = "ABI", required = false)
    private String abi;
    @Element(name = "CAB", required = false)
    private String cab;
    @Element(name = "BIC", required = false)
    private String bic;
    @Element(name = "ScontoPagamentoAnticipato", required = false)
    private String scontoPagamentoAnticipato;
    @Element(name = "DataLimitePagamentoAnticipato", required = false)
    private String dataLimitePagamentoAnticipato;
    @Element(name = "PenalitaPagamentiRitardati", required = false)
    private String penalitaPagamentiRitardati;
    @Element(name = "DataDecorrenzaPenale", required = false)
    private String dataDecorrenzaPenale;
    @Element(name = "CodicePagamento", required = false)
    private String codicePagamento;

    public DettaglioPagamentoType() {
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public ModalitaPagamentoType getModalitaPagamento() {
        return modalitaPagamento;
    }

    public void setModalitaPagamento(ModalitaPagamentoType modalitaPagamento) {
        this.modalitaPagamento = modalitaPagamento;
    }

    public String getDataRiferimentoTerminiPagamento() {
        return dataRiferimentoTerminiPagamento;
    }

    public void setDataRiferimentoTerminiPagamento(String dataRiferimentoTerminiPagamento) {
        this.dataRiferimentoTerminiPagamento = dataRiferimentoTerminiPagamento;
    }

    public String getGiorniTerminiPagamento() {
        return giorniTerminiPagamento;
    }

    public void setGiorniTerminiPagamento(String giorniTerminiPagamento) {
        this.giorniTerminiPagamento = giorniTerminiPagamento;
    }

    public String getDataScadenzaPagamento() {
        return dataScadenzaPagamento;
    }

    public void setDataScadenzaPagamento(String dataScadenzaPagamento) {
        this.dataScadenzaPagamento = dataScadenzaPagamento;
    }

    public String getImportoPagamento() {
        return importoPagamento;
    }

    public void setImportoPagamento(String importoPagamento) {
        this.importoPagamento = importoPagamento;
    }

    public String getCodUfficioPostale() {
        return codUfficioPostale;
    }

    public void setCodUfficioPostale(String codUfficioPostale) {
        this.codUfficioPostale = codUfficioPostale;
    }

    public String getCognomeQuietanzante() {
        return cognomeQuietanzante;
    }

    public void setCognomeQuietanzante(String cognomeQuietanzante) {
        this.cognomeQuietanzante = cognomeQuietanzante;
    }

    public String getNomeQuietanzante() {
        return nomeQuietanzante;
    }

    public void setNomeQuietanzante(String nomeQuietanzante) {
        this.nomeQuietanzante = nomeQuietanzante;
    }

    public String getCfQuietanzante() {
        return cfQuietanzante;
    }

    public void setCfQuietanzante(String cfQuietanzante) {
        this.cfQuietanzante = cfQuietanzante;
    }

    public String getTitoloQuietanzante() {
        return titoloQuietanzante;
    }

    public void setTitoloQuietanzante(String titoloQuietanzante) {
        this.titoloQuietanzante = titoloQuietanzante;
    }

    public String getIstitutoFinanziario() {
        return istitutoFinanziario;
    }

    public void setIstitutoFinanziario(String istitutoFinanziario) {
        this.istitutoFinanziario = istitutoFinanziario;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getAbi() {
        return abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getScontoPagamentoAnticipato() {
        return scontoPagamentoAnticipato;
    }

    public void setScontoPagamentoAnticipato(String scontoPagamentoAnticipato) {
        this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
    }

    public String getDataLimitePagamentoAnticipato() {
        return dataLimitePagamentoAnticipato;
    }

    public void setDataLimitePagamentoAnticipato(String dataLimitePagamentoAnticipato) {
        this.dataLimitePagamentoAnticipato = dataLimitePagamentoAnticipato;
    }

    public String getPenalitaPagamentiRitardati() {
        return penalitaPagamentiRitardati;
    }

    public void setPenalitaPagamentiRitardati(String penalitaPagamentiRitardati) {
        this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
    }

    public String getDataDecorrenzaPenale() {
        return dataDecorrenzaPenale;
    }

    public void setDataDecorrenzaPenale(String dataDecorrenzaPenale) {
        this.dataDecorrenzaPenale = dataDecorrenzaPenale;
    }

    public String getCodicePagamento() {
        return codicePagamento;
    }

    public void setCodicePagamento(String codicePagamento) {
        this.codicePagamento = codicePagamento;
    }

}
