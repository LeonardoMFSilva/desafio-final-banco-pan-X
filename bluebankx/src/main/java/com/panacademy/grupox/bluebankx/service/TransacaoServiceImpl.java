package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.dao.TransacaoDao;
import com.panacademy.grupox.bluebankx.model.TransacaoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)

public class TransacaoServiceImpl{
    @Autowired
    private TransacaoDao dao;

    public void salvar(TransacaoModel transacaoModel){
        dao.save(transacaoModel);
    }

    public void editar(TransacaoModel transacaoModel) {
        dao.update(transacaoModel);
    }

    public void excluir(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    public TransacaoModel buscarPorId(Long id) {
        //
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    public List<TransacaoModel> buscarTodos() {
        //
        return dao.findAll();
    }

}

