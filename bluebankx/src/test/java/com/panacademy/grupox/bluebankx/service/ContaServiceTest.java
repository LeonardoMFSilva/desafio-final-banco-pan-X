package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.dao.ContaDaoImpl;
import com.panacademy.grupox.bluebankx.model.ContaModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class ContaServiceTest {

    @Mock ContaDaoImpl contaDao;

    @InjectMocks ContaService contaService;

    @Test
    void deveSalvarConta(){
        ContaModel contaModel = new ContaModel();
        contaModel.setNumConta("123");
        contaModel.setNome("Yuri Yago");
        contaService.salvar(contaModel);

        verify(contaDao, times(1)).save(contaModel);
    }

    @Test
    void deveEditarConta(){
        ContaModel contaModel = new ContaModel();
        contaModel.setNumConta("123");
        contaModel.setNome("Yuri Yago");
        contaService.editar(contaModel);

        verify(contaDao, times(1)).update(contaModel);
    }

    @Test
    void deveExlcuirConta(){
        contaService.excluir(1L);

        verify(contaDao, times(1)).delete(1L);
    }

}