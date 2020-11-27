package com.controlechamados.usuario.perfil.dto;

import com.controlechamados.models.dto.EntityGridDTO;

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
