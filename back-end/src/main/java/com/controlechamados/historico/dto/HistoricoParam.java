package com.controlechamados.historico.dto;

import com.controlechamados.historico.enums.AcaoEnum;
import com.controlechamados.historico.enums.TabelaEnum;

import java.util.UUID;

public class HistoricoParam {

    private TabelaEnum tabelaEnum;
    private AcaoEnum acaoEnum;
    private UUID id;
    private String dados;

    public HistoricoParam(TabelaEnum tabelaEnum, AcaoEnum acaoEnum, UUID id, String dados) {
        this.tabelaEnum = tabelaEnum;
        this.acaoEnum = acaoEnum;
        this.id = id;
        this.dados = dados;
    }

    public TabelaEnum getTabelaEnum() {
        return tabelaEnum;
    }

    public AcaoEnum getAcaoEnum() {
        return acaoEnum;
    }

    public UUID getId() {
        return id;
    }

    public String getDados() {
        return dados;
    }

    @Override
    public String toString() {
        return "HistoricoParam{" +
                "tabelaEnum=" + tabelaEnum +
                ", acaoEnum=" + acaoEnum +
                ", id=" + id +
                ", dados='" + dados + '\'' +
                '}';
    }
}
