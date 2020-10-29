package com.controlechamados.chamado.categoria.subcategoria.dto;

import com.controlechamados.chamado.categoria.dto.CategoriaDTO;

import java.util.UUID;

public class SubCategoriaDTO {

    private UUID id;
    private CategoriaDTO categoriaDTO;
    private String descricao;

    public SubCategoriaDTO(UUID id, CategoriaDTO categoriaDTO, String descricao) {
        this.id = id;
        this.categoriaDTO = categoriaDTO;
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }

    public CategoriaDTO getCategoriaDTO() {
        return categoriaDTO;
    }

    public String getDescricao() {
        return descricao;
    }
}
