package com.controlechamados.chamado.categoria.dto;

import java.util.UUID;

public class CategoriaDTO {

    private UUID id;
    private String descricao;

    public CategoriaDTO(UUID id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
