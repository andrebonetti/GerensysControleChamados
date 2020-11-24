package com.controlechamados.historico.dto;

import com.controlechamados.models.AbstractEntity;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;

public class HistoricoParam {

    private TabelaEnum tabelaEnum;
    private AcaoEnum acaoEnum;
    private AbstractEntity abstractEntity;

    public HistoricoParam(TabelaEnum tabelaEnum,
                          AcaoEnum acaoEnum,
                          AbstractEntity abstractEntity) {
        this.tabelaEnum = tabelaEnum;
        this.acaoEnum = acaoEnum;
        this.abstractEntity = abstractEntity;
    }

    public TabelaEnum getTabelaEnum() {
        return tabelaEnum;
    }

    public AcaoEnum getAcaoEnum() {
        return acaoEnum;
    }

    public AbstractEntity getEntity() {
        return abstractEntity;
    }

    @Override
    public String toString() {
        return "HistoricoParam{" +
                "tabelaEnum=" + tabelaEnum +
                ", acaoEnum=" + acaoEnum +
                ", entity=" + abstractEntity +
                '}';
    }
}
