package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
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

    public static Empresa toEntity(EmpresaFormCriacaoDTO form) {

        return Empresa.builder()
                .withNome( form.getNome() )
                .withImagem( form.getImagem() )
                .build();
    }

    public static Empresa toEntity(EmpresaFormAtualizacaoDTO form) {

        return Empresa.builder()
                .withNome( form.getNome() )
                .withImagem( form.getImagem() )
                .build();
    }

    public static void toEntity(Empresa empresa, EmpresaFormAtualizacaoDTO form) {

        empresa.atualizar()
                .withNome( form.getNome() )
                .withImagem( form.getImagem() )
                .build();
    }

}
