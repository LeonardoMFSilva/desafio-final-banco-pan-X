package com.panacademy.grupox.bluebankx.service;

public class ClienteServiceImpl {
}

//import com.panacademy.grupox.bluebankx.model.ClienteModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional(readOnly = false)
//public class ClienteServiceImpl implements ClienteService{
//    @Autowired
//    private ClienteDao dao;
//
//    @Override
//    public void salvar(ClienteModel clienteModel){
//        dao.save(clienteModel);
//    }
//
//    @Override
//    public void editar(ClienteModel clienteModel) {
//        dao.update(clienteModel);
//    }
//
//    @Override
//    public void excluir(Long id) {
//        dao.delete(id);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public ClienteModel buscarPorId(Long id) {
//        //
//        return dao.findById(id);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<ClienteModel> buscarTodos() {
//        //
//        return dao.findAll();
//    }
//
//}
