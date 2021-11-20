package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.model.ClienteModel;

import java.util.List;

public interface ContaService {
    void salvar(ClienteModel clienteModel);

    void editar(ClienteModel clienteModel);

    void excluir(Long id);

    ClienteModel buscarPorId(Long id);

    List<ClienteModel> buscarTodos();
}
