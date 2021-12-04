package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.dao.ContaDao;
import com.panacademy.grupox.bluebankx.model.ContaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = false)
public class ContaService {
    @Autowired
    private ContaDao dao;

    public void salvar(ContaModel contaModel) {
        dao.save(contaModel);
    }

    public void editar(ContaModel contaModel) {
        dao.update(contaModel);
    }

    public void excluir(Long id) {
        dao.delete(id);
    }

    public ContaModel buscarPorId(Long id) {
        return dao.findById(id);
    }

    public List<ContaModel> buscarTodos() {
        return dao.findAll();
    }
}
