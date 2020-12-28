package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaCompleteGridDTO;
import com.controlechamados.empresa.dto.EmpresaSimpleGridDTO;
import com.controlechamados.utils.MaskConverter;

public class EmpresaConverter {

    public static EmpresaSimpleGridDTO toSimpleGridDTO(Empresa empresa) {

        return EmpresaSimpleGridDTO.builder()
                .withId(empresa.getId().toString())
                .withRazaoSocial( empresa.getRazaoSocial() )
                .withImagem( empresa.getImagem() )
                .build();
    }

    public static EmpresaCompleteGridDTO toCompleteGridDTO(Empresa empresa) {

        return EmpresaCompleteGridDTO.builder()
                .withCnpj(empresa.getCnpj().toString())
                .withRazaoSocial( empresa.getRazaoSocial() )
                .withImagem( empresa.getImagem() )
                .withPropertiesGridDto ( empresa )
                .build();
    }

    public static Empresa toEntity(EmpresaFormCriacaoDTO form) {

        return Empresa.create()
                .withCnpj(MaskConverter.toNumber(form.getCnpj()))
                .withRazaoSocial( form.getRazaoSocial() )
                .withImagem( form.getImagem() )
                .build();
    }

    public static void toEntity(Empresa empresa, EmpresaFormAtualizacaoDTO form) {

        empresa.update()
                .withRazaoSocial( form.getRazaoSocial() )
                .withImagem( form.getImagem() )
                .build();
    }

}
