package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.dao.ClienteDaoImpl;
import com.panacademy.grupox.bluebankx.model.ClienteModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ClienteServiceTest {

    @Mock ClienteDaoImpl clienteDao;

    @InjectMocks
    ClienteService clienteService;

    @Test
    void deveSalvar(){
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setCpf("123456789");
        clienteModel.setNome("Yuri Yago");
        clienteService.salvar(clienteModel);

        verify(clienteDao, times(1)).save(clienteModel);
    }

    @Test
    void deveEditar(){
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setCpf("123456789");
        clienteModel.setNome("Yuri Yago");
        clienteService.editar(clienteModel);

        verify(clienteDao, times(1)).update(clienteModel);

    }

    @Test
    void deveExcluir(){
        clienteService.excluir(1L);

        verify(clienteDao, times(1)).delete(1L);

    }


}