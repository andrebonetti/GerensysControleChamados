package com.controlechamados.empresa;

import com.controlechamados.chamado.categoria.Categoria;
import com.controlechamados.chamado.categoria.dto.CategoriaGridDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;

public class EmpresaConverter {

    public static EmpresaGridDTO toGridDTO(Empresa empresa){

        return new EmpresaGridDTO(empresa.getId().toString(),
                empresa.getImagem(),
                empresa.getNome());

    }

}
