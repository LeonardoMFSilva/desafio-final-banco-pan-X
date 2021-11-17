package com.panacademy.grupox.bluebankx.model;

import java.math.BigDecimal;

public class ContaModel {
    private Integer id;
    private String nome;
    private String tipo;
    private String numConta;
    private BigDecimal saldo;
    private BigDecimal credito;
    private BigDecimal creditoTotal;

    public ContaModel(Integer id, String nome, String tipo, String numConta, BigDecimal saldo, BigDecimal credito, BigDecimal creditoTotal) {
        super();
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.numConta = numConta;
        this.saldo = saldo;
        this.credito = credito;
        this.creditoTotal = creditoTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getCredito() {
        return credito;
    }

    public void setCredito(BigDecimal credito) {
        this.credito = credito;
    }

    public BigDecimal getCreditoTotal() {
        return creditoTotal;
    }

    public void setCreditoTotal(BigDecimal creditoTotal) {
        this.creditoTotal = creditoTotal;
    }
}