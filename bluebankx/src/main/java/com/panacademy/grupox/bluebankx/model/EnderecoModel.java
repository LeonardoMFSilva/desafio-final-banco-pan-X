package com.panacademy.grupox.bluebankx.model;

import com.panacademy.grupox.bluebankx.helpers.UF;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class EnderecoModel extends AbstractEntity{

    @Column(name = "id_cliente", nullable = false, unique = true, columnDefinition = "INT")
    private Integer id;

    @Column(name = "cep", nullable = false)
    private String cep;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "complemento", nullable = true)
    private String complemento;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Column(name = "uf", nullable = false)
    private UF uf;

    public EnderecoModel(final Integer id, final String cep, final String logradouro, final String bairro, final Integer numero, final String complemento, final String cidade, final UF uf) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(final Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(final String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(final String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(final String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(final Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(final String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(final String cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(final UF uf) {
        this.uf = uf;
    }
}
