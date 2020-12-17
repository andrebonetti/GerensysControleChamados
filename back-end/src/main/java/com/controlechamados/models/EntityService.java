package com.controlechamados.models;

import com.controlechamados.historico.HistoricoService;
import com.controlechamados.historico.dto.HistoricoParam;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    private HistoricoService historicoService;
    private TabelaEnum tabelaEnum;
    private CrudRepository dao;

    public EntityService() {
    }

    public EntityService(HistoricoService historicoService,
         TabelaEnum tabelaEnum,
         CrudRepository crudRepository) {
        this.historicoService = historicoService;
        this.tabelaEnum = tabelaEnum;
        this.dao = crudRepository;
    }

    protected void save(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        preSave ( abstractEntity,acaoEnum );
        dao.save( abstractEntity );
        posSave( abstractEntity,acaoEnum );

    }

    protected void preSave(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        abstractEntity.setPropriedadePorAcao( acaoEnum );

    }

    protected void posSave(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        historicoService.criarHistoricoRegistro( new HistoricoParam(
            this.tabelaEnum,
            acaoEnum,
            abstractEntity
        ));

    }

}
