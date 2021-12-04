package com.panacademy.grupox.bluebankx.dao;

import com.panacademy.grupox.bluebankx.model.TransacaoModel;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TransacaoDaoImpl extends AbstractDao<TransacaoModel, Long> implements TransacaoDao {
    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager(){
        return entityManager;
    }
//    @Query(value = "select t from transacoes t where t.clienteOrigemTransacao = :id")
    public List<TransacaoModel> listarTransacoes(Long id) {
        String sqlScript="select * from transacoes where transacoes.id_cliente_fk = "+id+" union select * from transacoes where transacoes.id_cliente_destino_fk = "+id+" order by data_hora_transacao desc";
        Query q = entityManager.createNativeQuery(sqlScript);

        List<TransacaoModel> transacaoModels=q.getResultList();
        return transacaoModels;
    }
    public List<TransacaoModel> listarTransacoesData(Long id, String dataInicio, String dataFim) {
        String sqlScript="select * from blue_bank.transacoes t where t.id_cliente_fk = "+id+" and t.data_hora_transacao between " +
                dataInicio+ " and "+dataFim+" union select * from blue_bank.transacoes d where d.id_cliente_destino_fk = "+
                id+" and d.data_hora_transacao between "+dataInicio+" and "+dataFim+" order by data_hora_transacao desc";
        Query q = entityManager.createNativeQuery(sqlScript);

        List<TransacaoModel> transacaoModels=q.getResultList();
        return transacaoModels;
    }
}
