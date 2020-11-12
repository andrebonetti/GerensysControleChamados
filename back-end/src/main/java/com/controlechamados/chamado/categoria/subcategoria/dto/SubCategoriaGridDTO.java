package com.controlechamados.chamado.categoria.subcategoria.dto;

import com.controlechamados.chamado.categoria.dto.CategoriaGridDTO;

public class SubCategoriaGridDTO {

    private String id;
    private CategoriaGridDTO categoriaGridDTO;
    private String descricao;

    public SubCategoriaGridDTO(String id, CategoriaGridDTO categoriaGridDTO, String descricao) {
        this.id = id;
        this.categoriaGridDTO = categoriaGridDTO;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public CategoriaGridDTO getCategoriaDTO() {
        return categoriaGridDTO;
    }

    public String getDescricao() {
        return descricao;
    }
}
