package com.controlechamados.usuario.perfil.dto;

import com.controlechamados.models.dto.EntityGridDTO;

public class PerfilFormAtualizacaoDTO {

    private String id;
    private String descricao;

    public PerfilFormAtualizacaoDTO(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "PerfilFormAtualizacaoDTO{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
