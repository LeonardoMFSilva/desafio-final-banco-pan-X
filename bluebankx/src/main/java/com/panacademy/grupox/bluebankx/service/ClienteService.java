package com.panacademy.grupox.bluebankx.service;


import com.panacademy.grupox.bluebankx.dao.ClienteDao;
import com.panacademy.grupox.bluebankx.model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class ClienteService {
    @Autowired
    private ClienteDao dao;

    public void salvar(ClienteModel clienteModel){
        dao.save(clienteModel);
    }

    public void editar(ClienteModel clienteModel) {
        dao.update(clienteModel);
    }

    public void excluir(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    public ClienteModel buscarPorId(Long id) {
        //
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    public List<ClienteModel> buscarTodos() {
        //
        return dao.findAll();
    }

}
