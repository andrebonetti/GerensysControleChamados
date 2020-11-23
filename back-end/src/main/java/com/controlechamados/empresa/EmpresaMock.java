package com.controlechamados.empresa;

import com.controlechamados.entity.enums.AcaoEnum;

import java.util.List;

public class EmpresaMock {

    public static Empresa empresaCase1() {

        Empresa empresa = Empresa.builder()
                .withNome( "Nome case 1 MOCK" )
                .withImagem( "Imagem case 1 MOCK" )
                .build();

        empresa.setPropriedadePorAcao( AcaoEnum.CRIACAO );

        return empresa;
    }

    public static Empresa empresaCase2() {

        Empresa empresa = Empresa.builder()
                .withNome( "Nome case 2 MOCK" )
                .withImagem( "Imagem case 2 MOCK" )
                .build();

        empresa.setPropriedadePorAcao( AcaoEnum.CRIACAO );
        empresa.setPropriedadePorAcao( AcaoEnum.ATUALIZACAO );

        return empresa;
    }

    public static List<Empresa> empresaCases() {
        return List.of( empresaCase1(), empresaCase2() );
    }

}
