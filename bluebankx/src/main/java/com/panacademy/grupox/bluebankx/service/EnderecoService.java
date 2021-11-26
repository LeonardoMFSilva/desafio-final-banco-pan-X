package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.dao.EnderecoDao;
import com.panacademy.grupox.bluebankx.model.ClienteModel;
import com.panacademy.grupox.bluebankx.model.EnderecoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class EnderecoService {

    @Autowired
    private EnderecoDao dao;

    public void salvar(EnderecoModel enderecoModel){
        dao.save(enderecoModel);
    }

    public void editar(EnderecoModel enderecoModel) {
        dao.update(enderecoModel);
    }

    public void excluir(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    public EnderecoModel buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    public List<EnderecoModel> buscarTodos() {
        return dao.findAll();
    }

}
