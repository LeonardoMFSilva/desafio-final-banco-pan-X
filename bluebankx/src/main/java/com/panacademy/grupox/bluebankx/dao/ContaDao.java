package com.panacademy.grupox.bluebankx.dao;

import com.panacademy.grupox.bluebankx.model.ContaModel;
import java.util.List;

public interface ContaDao {
    void save(ContaModel contaModel);
    void update(ContaModel contaModel);
    void delete(Long id);
    ContaModel findById(Long id);
    List<ContaModel> findAll();
}
