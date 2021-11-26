package com.panacademy.grupox.bluebankx.dao;

import com.panacademy.grupox.bluebankx.model.EnderecoModel;

import java.util.List;

public interface EnderecoDao {
    void save(EnderecoModel enderecoModel);
    void update(EnderecoModel enderecoModel);
    void delete(Long id);
    EnderecoModel findById(Long id);
    List<EnderecoModel> findAll();
}
