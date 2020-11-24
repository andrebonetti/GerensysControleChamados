package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;

public class EmpresaConverter {

    public static EmpresaGridDTO toSimpleGridDTO(Empresa empresa) {

        return EmpresaGridDTO.builder()
                .withNome( empresa.getRazaoSocial() )
                .withImagem( empresa.getImagem() )
                .withPropertiesGridDto ( empresa )
                .build();
    }

    public static EmpresaGridDTO toCompleteGridDTO(Empresa empresa) {

        return EmpresaGridDTO.builder()
                .withNome( empresa.getRazaoSocial() )
                .withImagem( empresa.getImagem() )
                .withPropertiesGridDto ( empresa )
                .build();
    }

    public static Empresa toEntity(EmpresaFormCriacaoDTO form) {

        return Empresa.builder()
                .withRazaoSocial( form.getNome() )
                .withImagem( form.getImagem() )
                .build();
    }

    public static Empresa toEntity(EmpresaFormAtualizacaoDTO form) {

        return Empresa.builder()
                .withRazaoSocial( form.getNome() )
                .withImagem( form.getImagem() )
                .build();
    }

    public static void toEntity(Empresa empresa, EmpresaFormAtualizacaoDTO form) {

        empresa.atualizar()
                .withRazaoSocial( form.getNome() )
                .withImagem( form.getImagem() )
                .build();
    }

}
