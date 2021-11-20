package com.panacademy.grupox.bluebankx.model;

import com.panacademy.grupox.bluebankx.helpers.UF;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "CLIENTES")
public class ClienteModel extends AbstractEntity<Long>{
    @Column(name = "id_cliente", nullable = false, unique = true, columnDefinition = "INT")
    private Integer id;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_nascimento", nullable = false, columnDefinition = "DATE")
    private LocalDate dataNasc;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone", nullable = false, unique = true)
    private String telefone;

    @Column(name = "profissao", nullable = false)
    private String profissao;

    @Column(name = "renda", nullable = false, columnDefinition = "DECIMAL(8, 2) DEFAULT 0.00")
    private BigDecimal renda;

    @Column(name = "patrimonio", nullable = false, columnDefinition = "DECIMAL(11, 2) DEFAULT 0.00")
    private BigDecimal patrimonio;

    // CONTA
    @OneToOne
    @JoinColumn(name = "conta_model_id_fk")
    private ContaModel contaModel;

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

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public void setContaModel(ContaModel contaModel) {
        this.contaModel = contaModel;
    }
}
