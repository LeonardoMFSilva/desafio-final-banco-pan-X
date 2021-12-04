package com.panacademy.grupox.bluebankx.dto;

import com.panacademy.grupox.bluebankx.helpers.UF;
import com.panacademy.grupox.bluebankx.model.ClienteModel;
import com.panacademy.grupox.bluebankx.model.ContaModel;
import com.panacademy.grupox.bluebankx.model.EnderecoModel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ClienteDTO {
    //ClienteModel
    private String cpf;
    private String senha;
    private String nome;
    private LocalDate dataNasc;
    private String email;
    private String telefone;
    private String profissao;
    private BigDecimal renda;
    private BigDecimal patrimonio;

    //EnderecoModel
    private String cep;
    private String logradouro;
    private String bairro;
    private Integer numero;
    private String complemento;
    private String cidade;
    private UF uf;

    //ContaModel
    private String nomePreferencial;
    private String tipo;
    private BigDecimal saldo;
    private BigDecimal credito;
    private BigDecimal creditoTotal;

    private ContaModel criarConta(){
        ContaModel contaModel = new ContaModel();
        contaModel.setNumConta(ContaModel.gerarNumConta());
        contaModel.setCredito(credito);
        contaModel.setCreditoTotal(creditoTotal);
        contaModel.setSaldo(saldo);
        contaModel.setNome(nomePreferencial);
        contaModel.setTipo(tipo);

        return contaModel;
    }

    private EnderecoModel criarEndereco(){
        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setBairro(bairro);
        enderecoModel.setCep(cep);
        enderecoModel.setCidade(cidade);
        enderecoModel.setComplemento(complemento);
        enderecoModel.setLogradouro(logradouro);
        enderecoModel.setNumero(numero);
        enderecoModel.setUf(uf);

        return enderecoModel;
    }

    public ClienteModel criarCliente(){
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNome(nome);
        clienteModel.setCpf(cpf);
        clienteModel.setSenha(senha);
        clienteModel.setDataNasc(dataNasc);
        clienteModel.setEmail(email);
        clienteModel.setTelefone(telefone);
        clienteModel.setProfissao(profissao);
        clienteModel.setPatrimonio(patrimonio);
        clienteModel.setRenda(renda);
        clienteModel.setEnderecoModel(criarEndereco());
        clienteModel.setContaModel(criarConta());

        return clienteModel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }

    public BigDecimal getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(BigDecimal patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public String getNomePreferencial() {
        return nomePreferencial;
    }

    public void setNomePreferencial(String nomePreferencial) {
        this.nomePreferencial = nomePreferencial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
