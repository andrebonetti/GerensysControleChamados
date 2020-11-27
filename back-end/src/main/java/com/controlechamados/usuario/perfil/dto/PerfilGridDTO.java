package com.controlechamados.usuario.perfil.dto;

import com.controlechamados.models.BuilderEntityGridDTO;
import com.controlechamados.models.dto.EntityGridDTO;

public class PerfilGridDTO extends EntityGridDTO {

    private String descricao;

    public PerfilGridDTO(String descricao) {
        this.descricao = descricao;
    }

    public PerfilGridDTO(String descricao, BuilderEntityGridDTO builderEntityGridDTO) {
        this.descricao = descricao;
        super.construct( builderEntityGridDTO );
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "PerfilGridDTO{" +
                ", nome='" + descricao + '\'' +
                '}';
    }
}
