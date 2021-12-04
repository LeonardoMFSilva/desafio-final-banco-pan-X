package com.panacademy.grupox.bluebankx.service;

import com.panacademy.grupox.bluebankx.dao.EnderecoDaoImpl;
import com.panacademy.grupox.bluebankx.model.EnderecoModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class EnderecoServiceTest {

    @Mock EnderecoDaoImpl enderecoDao;

    @InjectMocks EnderecoService enderecoService;

    @Test
    void deveSalvarEndereco(){
        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setCep("00000-000");
        enderecoService.salvar(enderecoModel);

        verify(enderecoDao, times(1)).save(enderecoModel);
    }

    @Test
    void deveEditarEndereco(){
        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setCep("00000-000");
        enderecoService.editar(enderecoModel);

        verify(enderecoDao, times(1)).update(enderecoModel);
    }

    @Test
    void deveExlcuirEndereco(){
        enderecoService.excluir(1L);

        verify(enderecoDao, times(1)).delete(1L);
    }

}