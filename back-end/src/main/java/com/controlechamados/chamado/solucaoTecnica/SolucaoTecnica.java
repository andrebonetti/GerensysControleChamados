package com.controlechamados.chamado.solucaoTecnica;

import java.util.UUID;

public class SolucaoTecnica {

    private UUID id;
    private String tipo;
    private String descricao;
    private Boolean concluido;

    public SolucaoTecnica(UUID id, String tipo, String descricao, Boolean concluido) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public UUID getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    @Override
    public String toString() {
        return "SolucaoTecnica{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }
}


