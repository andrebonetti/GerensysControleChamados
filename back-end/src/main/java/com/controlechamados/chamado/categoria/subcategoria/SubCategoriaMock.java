package com.controlechamados.chamado.categoria.subcategoria;

import com.controlechamados.chamado.categoria.Categoria;
import com.controlechamados.chamado.categoria.CategoriaMock;

import java.util.UUID;

public class SubCategoriaMock {

    public static SubCategoria correctSubCategoria(){

        Categoria categoria = CategoriaMock.correctCategoria();

        return new SubCategoria( UUID.randomUUID(),categoria, "Descricao MOCK" );
    }

}
