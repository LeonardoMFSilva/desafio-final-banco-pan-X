package com.panacademy.grupox.bluebankx.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.panacademy.grupox.bluebankx.helpers.TipoTrasacao;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacoes")
public class TransacaoModel extends AbstractEntity<Long>{

//    @Id
//    @GeneratedValue
//    private Integer id;

    @Column(name = "valor")
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_transacao")
    private TipoTrasacao tipoTransacao;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "data_hora_transacao")
    private LocalDateTime dataHoraTransacao;

//    @OneToOne(cascade = CascadeType.ALL)
//    @Column(name = "cliente_origem_id")
//    private ClienteModel clienteOrigem;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @Column(name = "cliente_destino_id")
//    private ClienteModel clienteDestino;

    @ManyToOne
    @JoinColumn(name = "id_cliente_destino_fk")
    private ClienteModel clienteDestinoTransacao;

    @ManyToOne
    @JoinColumn(name = "id_cliente_fk")
    private ClienteModel clienteOrigemTransacao;

//    public TransacaoModel() {
//    }
//
//    public TransacaoModel(TipoTrasacao tipoTransacao, ClienteModel clienteOrigem, ClienteModel clienteDestino, BigDecimal valor, LocalDateTime dataHoraTransacao) {
//       //this.id = id;
//        this.tipoTransacao = tipoTransacao;
//        this.clienteOrigem = clienteOrigem;
//        this.clienteDestino = clienteDestino;
//        this.valor = valor;
//        this.dataHoraTransacao = dataHoraTransacao;
//    }

//    @Override
//    public Integer getId() {
//        return id;
//    }
//
//    @Override
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public TipoTrasacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTrasacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

//    public ClienteModel getClienteOrigem() {
//        return clienteOrigem;
//    }
//
//    public void setClienteOrigem(ClienteModel clienteOrigem) {
//        this.clienteOrigem = clienteOrigem;
//    }
//
//    public ClienteModel getClienteDestino() {
//        return clienteDestino;
//    }
//
//    public void setClienteDestino(ClienteModel clienteDestino) {
//        this.clienteDestino = clienteDestino;
//    }

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

    public ClienteModel getClienteOrigemTransacao() {
        return clienteOrigemTransacao;
    }

    public void setClienteOrigemTransacao(ClienteModel clienteOrigemTransacao) {
        this.clienteOrigemTransacao = clienteOrigemTransacao;
    }

    public ClienteModel getClienteDestinoTransacao() {
        return clienteDestinoTransacao;
    }

    public void setClienteDestinoTransacao(ClienteModel clienteDestinoTransacao) {
        this.clienteDestinoTransacao = clienteDestinoTransacao;
    }
}
