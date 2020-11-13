package com.controlechamados.chamado.solucaoTecnica.dto;

public class SolucaoTecnicaGridDTO {

    private String id;
    private String tipo;
    private String descricao;
    private Boolean concluido;

    public SolucaoTecnicaGridDTO(String id, String tipo, String descricao, Boolean concluido) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getId() {
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
        return "SolucaoTecnicaGridDTO{" +
                "id='" + id + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }
}
