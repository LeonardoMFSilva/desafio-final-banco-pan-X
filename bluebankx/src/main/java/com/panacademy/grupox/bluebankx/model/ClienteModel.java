package com.panacademy.grupox.bluebankx.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class ClienteModel extends AbstractEntity<Long>{

    @Column(name = "cpf", unique = true)
    private String cpf;

    @JsonIgnore
    @Column(name = "senha")
    private String senha;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento", columnDefinition = "DATE")
    private LocalDate dataNasc;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "telefone", unique = true)
    private String telefone;

    @Column(name = "profissao")
    private String profissao;

    @Column(name = "renda", columnDefinition = "DECIMAL(8, 2) DEFAULT 0.00")
    private BigDecimal renda;

    @Column(name = "patrimonio", columnDefinition = "DECIMAL(11, 2) DEFAULT 0.00")
    private BigDecimal patrimonio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_model_id")
    private EnderecoModel enderecoModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "conta_model_id")
    private ContaModel contaModel;

    @JsonIgnore
    @OneToMany(mappedBy = "clienteOrigemTransacao")
    private List<TransacaoModel> transacaoOrigem;

    @JsonIgnore
    @OneToMany(mappedBy = "clienteDestinoTransacao")
    private List<TransacaoModel> transacaoDestino;

    public ContaModel getContaModel() {
        return contaModel;
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

    public EnderecoModel getEnderecoModel() {
        return enderecoModel;
    }

    public void setEnderecoModel(EnderecoModel enderecoModel) {
        this.enderecoModel = enderecoModel;
    }

    public void setContaModel(ContaModel contaModel) {
        this.contaModel = contaModel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<TransacaoModel> getTransacaoOrigem() {
        return transacaoOrigem;
    }

    public void setTransacaoOrigem(List<TransacaoModel> transacaoOrigem) {
        this.transacaoOrigem = transacaoOrigem;
    }

    public List<TransacaoModel> getTransacaoDestino() {
        return transacaoDestino;
    }

    public void setTransacaoDestino(List<TransacaoModel> transacaoDestino) {
        this.transacaoDestino = transacaoDestino;
    }
}
