package com.panacademy.grupox.bluebankx.dao;

import com.panacademy.grupox.bluebankx.model.ClienteModel;

import java.util.List;

public interface ContaDao {
    void save(ContaDao contaDao);
    void update(ContaDao contaDao);
    void delete(Long id);
    ContaDao findById(Long id);
    List<ContaDao> findAll();
}
