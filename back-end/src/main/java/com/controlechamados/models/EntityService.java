package com.controlechamados.models;

import com.controlechamados.empresa.Empresa;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.historico.HistoricoService;
import com.controlechamados.historico.dto.HistoricoParam;
import org.springframework.stereotype.Service;

@Service
public class EntityService {

    private HistoricoService historicoService;
    private TabelaEnum tabelaEnum;

    public EntityService() {
    }

    public EntityService(HistoricoService historicoService, TabelaEnum tabelaEnum) {
        this.historicoService = historicoService;
        this.tabelaEnum = tabelaEnum;
    }

    protected void save(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        preSave ( abstractEntity,acaoEnum );
        //TODO SALVAR
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
