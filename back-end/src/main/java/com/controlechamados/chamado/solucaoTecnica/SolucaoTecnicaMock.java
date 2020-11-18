package com.controlechamados.chamado.solucaoTecnica;

import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaFormDTO;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class SolucaoTecnicaMock {

    public static SolucaoTecnica solucaoTecnicaCase1() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return new SolucaoTecnica().builder()
                .withId( UUID.randomUUID())
                .withTipo( "Tipo Case1 MOCK" )
                .withDescricao( "Descricao Case1 MOCK" )
                .withConcluido( Boolean.TRUE )
                .withUsuarioCriacao( usuarioCriacao )
                .withUsuarioModificaocao( usuarioResponsavel )
                .withDataCriacao( LocalDate.now() )
                .withDataModificacao( LocalDate.now() )
                .build();

    }

    public static SolucaoTecnica solucaoTecnicaCase2() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return new SolucaoTecnica().builder()
                .withId( UUID.randomUUID())
                .withTipo( "Tipo Case2 MOCK" )
                .withDescricao( "Descricao Case2 MOCK" )
                .withConcluido( Boolean.TRUE )
                .withUsuarioCriacao( usuarioCriacao )
                .withUsuarioModificaocao( usuarioResponsavel )
                .withDataCriacao( LocalDate.now() )
                .withDataModificacao( LocalDate.now() )
                .build();

    }

    public static SolucaoTecnica solucaoTecnicaCase3() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return new SolucaoTecnica().builder()
                .withId( UUID.randomUUID())
                .withTipo( "Tipo Case3 MOCK" )
                .withDescricao( "Descricao Case3 MOCK" )
                .withConcluido( Boolean.TRUE )
                .withUsuarioCriacao( usuarioCriacao )
                .withUsuarioModificaocao( usuarioResponsavel )
                .withDataCriacao( LocalDate.now() )
                .withDataModificacao( LocalDate.now() )
                .build();

    }

    public static List<SolucaoTecnica> solucaoTecnicasCases() {

        return List.of( solucaoTecnicaCase1(), solucaoTecnicaCase2(), solucaoTecnicaCase3() );

    }

    public static SolucaoTecnicaFormDTO solucaoTecnicaFormCase1(){
        return new SolucaoTecnicaFormDTO(
                "Tipo Form Case1 MOCK",
                "Descricao Form Case1 MOCK");
    }

    public static SolucaoTecnicaFormDTO solucaoTecnicaFormCase2(){
        return new SolucaoTecnicaFormDTO(
                "Tipo Form Case2 MOCK",
                "Descricao Form Case2 MOCK");
    }

    public static SolucaoTecnicaFormDTO solucaoTecnicaFormCase3(){
        return new SolucaoTecnicaFormDTO(
                "Tipo Form Case3 MOCK",
                "Descricao Form Case3 MOCK");
    }

    public static List<SolucaoTecnicaFormDTO> solucoesTecnicasFormCases(){
        return List.of(solucaoTecnicaFormCase1(),solucaoTecnicaFormCase2(),solucaoTecnicaFormCase3());
    }

}
