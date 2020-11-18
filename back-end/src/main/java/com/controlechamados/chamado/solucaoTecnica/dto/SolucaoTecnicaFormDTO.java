package com.controlechamados.chamado.solucaoTecnica.dto;

public class SolucaoTecnicaFormDTO {

    private String tipo;
    private String descricao;

    public SolucaoTecnicaFormDTO(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "SolucaoTecnicaGridDTO{" +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
