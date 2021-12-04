//package com.panacademy.grupox.bluebankx.service;
//
//import com.panacademy.grupox.bluebankx.dao.ContaDaoImpl;
//import com.panacademy.grupox.bluebankx.dao.TransacaoDaoImpl;
//import com.panacademy.grupox.bluebankx.model.TransacaoModel;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//
//@ExtendWith(MockitoExtension.class)
//class TransacaoServiceTest {
//
//    @Mock
//    TransacaoDaoImpl transacaoDao;
//
//    @InjectMocks
//    TransacaoService transacaoService;
//
//    @Test
//    void deveSalvarConta(){
//        TransacaoModel transacaoModel = new TransacaoModel();
//        transacaoModel.setId(1L);
//        transacaoService.salvar(transacaoModel);
//
//        verify(transacaoDao, times(1)).save(transacaoModel);
//    }
//
//    @Test
//    void deveEditarConta(){
//        TransacaoModel transacaoModel = new TransacaoModel();
//        transacaoModel.setId(1L);
//        transacaoService.editar(transacaoModel);
//
//        verify(transacaoDao, times(1)).update(transacaoModel);
//    }
//
//    @Test
//    void deveExlcuirConta(){
//        transacaoService.excluir(1L);
//
//        verify(transacaoDao, times(1)).delete(1L);
//    }
//
//}