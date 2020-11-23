package com.controlechamados.historico.dto;

import com.controlechamados.entity.Entity;
import com.controlechamados.entity.enums.AcaoEnum;
import com.controlechamados.entity.enums.TabelaEnum;

public class HistoricoParam {

    private TabelaEnum tabelaEnum;
    private AcaoEnum acaoEnum;
    private Entity entity;

    public HistoricoParam(TabelaEnum tabelaEnum,
                          AcaoEnum acaoEnum,
                          Entity entity) {
        this.tabelaEnum = tabelaEnum;
        this.acaoEnum = acaoEnum;
        this.entity = entity;
    }

    public TabelaEnum getTabelaEnum() {
        return tabelaEnum;
    }

    public AcaoEnum getAcaoEnum() {
        return acaoEnum;
    }

    public Entity getEntity() {
        return entity;
    }

    @Override
    public String toString() {
        return "HistoricoParam{" +
                "tabelaEnum=" + tabelaEnum +
                ", acaoEnum=" + acaoEnum +
                ", entity=" + entity +
                '}';
    }
}
