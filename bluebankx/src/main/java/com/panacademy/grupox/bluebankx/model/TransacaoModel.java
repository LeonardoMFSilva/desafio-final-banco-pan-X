package com.panacademy.grupox.bluebankx.model;

public class TransacaoModel {

    private Integer id;
    private String boleto;
    private String deposito;
    private String doc;
    private String pag;
    private String pix;
    private String saque;
    private String trCredito;
    private String trDebito;
    private String ted;

    public TransacaoModel(final Integer id, final String boleto, final String deposito, final String doc, final String pag, final String pix, final String saque, final String trCredito, final String trDebito, final String ted) {
        this.id = id;
        this.boleto = boleto;
        this.deposito = deposito;
        this.doc = doc;
        this.pag = pag;
        this.pix = pix;
        this.saque = saque;
        this.trCredito = trCredito;
        this.trDebito = trDebito;
        this.ted = ted;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(final String boleto) {
        this.boleto = boleto;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(final String deposito) {
        this.deposito = deposito;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(final String doc) {
        this.doc = doc;
    }

    public String getPag() {
        return pag;
    }

    public void setPag(final String pag) {
        this.pag = pag;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(final String pix) {
        this.pix = pix;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(final String saque) {
        this.saque = saque;
    }

    public String getTrCredito() {
        return trCredito;
    }

    public void setTrCredito(final String trCredito) {
        this.trCredito = trCredito;
    }

    public String getTrDebito() {
        return trDebito;
    }

    public void setTrDebito(final String trDebito) {
        this.trDebito = trDebito;
    }

    public String getTed() {
        return ted;
    }

    public void setTed(final String ted) {
        this.ted = ted;
    }
}
