package com.panacademy.grupox.bluebankx.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "contas")
public class ContaModel extends AbstractEntity<Long>{
    //@Column(name = "id_conta", nullable = false, unique = true, columnDefinition = "INT")
    //private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "num_conta", nullable = false, unique = true)
    private String numConta;

    @Column(name = "saldo", nullable = false, columnDefinition = "DECIMAL(7, 2) DEFAULT 0.00") // 7 dígitos com 2 casas decimais. E caso vc não coloque valores, por default vai ser o 0.00
    private BigDecimal saldo;

    @Column(name = "credito", nullable = false, columnDefinition = "DECIMAL(7, 2) DEFAULT 0.00")
    private BigDecimal credito;

    @Column(name = "credito_total", nullable = false, columnDefinition = "DECIMAL(7, 2) DEFAULT 0.00")
    private BigDecimal creditoTotal;
/*
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
*/
    //@Override
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public static String gerarNumConta(){
        SimpleDateFormat d = new SimpleDateFormat("yyyyMMdd.HHmmss-SSS");
        return d.format(new Date());
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