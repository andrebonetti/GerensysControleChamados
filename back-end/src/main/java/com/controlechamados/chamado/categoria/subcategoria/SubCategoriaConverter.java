package com.controlechamados.chamado.categoria.subcategoria;

import com.controlechamados.chamado.categoria.CategoriaConverter;
import com.controlechamados.chamado.categoria.dto.CategoriaGridDTO;
import com.controlechamados.chamado.categoria.subcategoria.dto.SubCategoriaGridDTO;

public class SubCategoriaConverter {

    public static SubCategoriaGridDTO toGridDTO(SubCategoria subCategoria){

        CategoriaGridDTO categoriaGridDTO = CategoriaConverter.toDto( subCategoria.getCategoria() );

        return new SubCategoriaGridDTO(subCategoria.getId().toString(),
                categoriaGridDTO,
                subCategoria.getDescricao());

    }

}
