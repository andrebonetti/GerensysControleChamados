package com.controlechamados.entity;

import com.controlechamados.empresa.Empresa;
import com.controlechamados.empresa.EmpresaConverter;
import com.controlechamados.empresa.EmpresaMock;
import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;
import com.controlechamados.entity.enums.AcaoEnum;
import com.controlechamados.entity.enums.TabelaEnum;
import com.controlechamados.historico.HistoricoService;
import com.controlechamados.historico.dto.HistoricoParam;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    protected void save(Empresa empresa, AcaoEnum acaoEnum){

        preSave ( empresa,acaoEnum );
        //TODO SALVAR
        posSave( empresa,acaoEnum );

    }

    protected void preSave(Entity entity, AcaoEnum acaoEnum){

        entity.setPropriedadePorAcao( acaoEnum );

    }

    protected void posSave(Entity entity, AcaoEnum acaoEnum){

        historicoService.criarHistoricoRegistro( new HistoricoParam(
            this.tabelaEnum,
            acaoEnum,
            entity
        ));

    }

}
