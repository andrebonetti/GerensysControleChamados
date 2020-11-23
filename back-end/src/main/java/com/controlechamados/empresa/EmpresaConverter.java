package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaGridDTO;

public class EmpresaConverter {

    public static EmpresaGridDTO toSimpleGridDTO(Empresa empresa) {

        return EmpresaGridDTO.builder()
                .withNome( empresa.getNome() )
                .withImagem( empresa.getImagem() )
                .withPropertiesGridDto ( empresa )
                .build();
    }

    public static EmpresaGridDTO toCompleteGridDTO(Empresa empresa) {

        return EmpresaGridDTO.builder()
                .withNome( empresa.getNome() )
                .withImagem( empresa.getImagem() )
                .withPropertiesGridDto ( empresa )
                .build();
    }

}
