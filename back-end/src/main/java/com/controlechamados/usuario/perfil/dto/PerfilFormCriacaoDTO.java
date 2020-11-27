package com.controlechamados.usuario.perfil.dto;

public class PerfilFormCriacaoDTO {

    private String descricao;

    public PerfilFormCriacaoDTO() {
        // to serialize
    }

    public PerfilFormCriacaoDTO(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "PerfilFormCriacaoDTO{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
