package com.panacademy.grupox.bluebankx.dao;

import com.panacademy.grupox.bluebankx.model.TransacaoModel;
import java.util.List;

public interface TransacaoDao {
    void save(TransacaoModel transacaoModel);
    void update(TransacaoModel transacaoModel);
    void delete(Long id);
    TransacaoModel findById(Long id);
    List<TransacaoModel> findAll();
    List<TransacaoModel> listarTransacoes(Long id);
    List<TransacaoModel> listarTransacoesData(Long id, String dataInicio, String dataFim);
}
