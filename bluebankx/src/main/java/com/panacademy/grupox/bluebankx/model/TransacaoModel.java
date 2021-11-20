package com.panacademy.grupox.bluebankx.model;

import com.panacademy.grupox.bluebankx.helpers.TipoTrasacao;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TRANSACOES")
public class TransacaoModel extends AbstractEntity<Long>{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "tipoTransacao")
    private TipoTrasacao tipoTransacao;

    @Column(name = "clienteOrigem")
    private ClienteModel clienteOrigem;

    @Column(name = "clienteDestino")
    private ClienteModel clienteDestino;

    private BigDecimal valor;
    private LocalDateTime dataHoraTransacao;

    public TransacaoModel(Integer id, TipoTrasacao tipoTransacao, ClienteModel clienteOrigem, ClienteModel clienteDestino, BigDecimal valor, LocalDateTime dataHoraTransacao) {
        this.id = id;
        this.tipoTransacao = tipoTransacao;
        this.clienteOrigem = clienteOrigem;
        this.clienteDestino = clienteDestino;
        this.valor = valor;
        this.dataHoraTransacao = dataHoraTransacao;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public TipoTrasacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTrasacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public ClienteModel getClienteOrigem() {
        return clienteOrigem;
    }

    public void setClienteOrigem(ClienteModel clienteOrigem) {
        this.clienteOrigem = clienteOrigem;
    }

    public ClienteModel getClienteDestino() {
        return clienteDestino;
    }

    public void setClienteDestino(ClienteModel clienteDestino) {
        this.clienteDestino = clienteDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHoraTransacao() {
        return dataHoraTransacao;
    }

    public void setDataHoraTransacao(LocalDateTime dataHoraTransacao) {
        this.dataHoraTransacao = dataHoraTransacao;
    }
}
