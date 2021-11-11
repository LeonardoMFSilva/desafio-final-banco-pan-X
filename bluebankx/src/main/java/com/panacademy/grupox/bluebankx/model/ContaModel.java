package com.panacademy.grupox.bluebankx.model;

public class ContaModel {
    private int id;
    private String nome;
    private String tipo;
    private String numero_conta;
    private double saldo;
    private double credito;

    public ContaModel(int id, String nome, String tipo, String numero_conta, double saldo, double credito){
        super();
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.numero_conta = numero_conta;
        this.saldo = saldo;
        this.credito = credito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
