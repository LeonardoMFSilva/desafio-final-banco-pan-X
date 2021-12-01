package com.panacademy.grupox.bluebankx.dao;

import com.panacademy.grupox.bluebankx.model.TransacaoModel;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface TransacaoDao {
    void save(TransacaoModel transacaoModel);
    void update(TransacaoModel transacaoModel);
    void delete(Long id);
    TransacaoModel findById(Long id);
    List<TransacaoModel> findAll();
    //@Query(value = "select t from transacoes t where t.clienteOrigemTransacao = :id")
    List<TransacaoModel> listarTransacoes(Long id);
    List<TransacaoModel> listarTransacoesData(Long id, String dataInicio, String dataFim);
}
