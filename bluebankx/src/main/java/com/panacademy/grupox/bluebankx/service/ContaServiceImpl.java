package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.model.ContaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import java.util.List;
//
//@Service
//@Transactional(readOnly = false)
//public class ContaServiceImpl implements ContaService{
//    @Autowired
//    private ContaDao dao;
//
//    @Override
//    public void salvar(ContaModel contaModel){
//        dao.save(contaModel);
//    }
//
//    @Override
//    public void editar(ContaModel contaModel) {
//        dao.update(contaModel);
//    }
//
//    @Override
//    public void excluir(Long id) {
//        dao.delete(id);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public ContaModel buscarPorId(Long id) {
//        //
//        return dao.findById(id);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<ContaModel> buscarTodos() {
//        //
//        return dao.findAll();
//    }
//
//}
