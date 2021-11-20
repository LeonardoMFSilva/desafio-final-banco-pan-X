package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.model.ContaModel;
import com.panacademy.grupox.bluebankx.model.TransacaoModel;

import java.util.List;

public interface TransacaoService {
    void salvar(TransacaoModel transacaoModel);

    void editar(TransacaoModel transacaoModel);

    void excluir(Long id);

    TransacaoModel buscarPorId(Long id);

    List<TransacaoModel> buscarTodos();
}
