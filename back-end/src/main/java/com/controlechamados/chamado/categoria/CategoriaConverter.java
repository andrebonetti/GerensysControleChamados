package com.controlechamados.chamado.categoria;

import com.controlechamados.chamado.categoria.dto.CategoriaGridDTO;

public class CategoriaConverter {

    public static CategoriaGridDTO toDto(Categoria categoria){

        return new CategoriaGridDTO(categoria.getId().toString(),
                categoria.getDescricao());

    }

}
