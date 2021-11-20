package com.panacademy.grupox.bluebankx.dao;

import com.panacademy.grupox.bluebankx.model.ClienteModel;

import java.util.List;

public interface ClienteDao {
    void save(ClienteModel clienteModel);
    void update(ClienteModel clienteModel);
    void delete(Long id);
    ClienteModel findById(Long id);
    List<ClienteModel> findAll();
}
