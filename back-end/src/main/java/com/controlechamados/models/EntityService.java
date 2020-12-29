package com.controlechamados.models;

import com.controlechamados.historico.HistoricoService;
import com.controlechamados.historico.dto.HistoricoParam;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    private TabelaEnum tabelaEnum;
    private CrudRepository dao;

    @Autowired
    private HistoricoService historicoService;

    @Autowired
    private UsuarioRepository usuarioDAO;

    public EntityService() {
    }

    public EntityService(TabelaEnum tabelaEnum,
         CrudRepository crudRepository) {
        this.tabelaEnum = tabelaEnum;
        this.dao = crudRepository;
    }

    protected void save(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        preSave ( abstractEntity,acaoEnum );
        dao.save( abstractEntity );
        posSave( abstractEntity,acaoEnum );

    }

    protected void preSave(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        abstractEntity.setPropriedadePorAcao( acaoEnum , this.usuarioDAO);

    }

    protected void posSave(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        historicoService.criarHistoricoRegistro( new HistoricoParam(
            this.tabelaEnum,
            acaoEnum,
            abstractEntity
        ));

    }

}
