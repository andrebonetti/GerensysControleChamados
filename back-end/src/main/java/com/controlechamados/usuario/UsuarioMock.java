package com.controlechamados.usuario;

import com.controlechamados.empresa.Empresa;
import com.controlechamados.empresa.EmpresaMock;
import com.controlechamados.usuario.perfil.Perfil;
import com.controlechamados.usuario.perfil.PerfilMock;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class UsuarioMock {

    public static Usuario usuarioResponsavel() {
        Perfil perfilAdministrador = PerfilMock.perfilAdministrador();

        return new Usuario().builder()
                .withId( UUID.randomUUID() )
                .withNome( "Nome Responsavel MOCK" )
                .withEmail( "Email Responsavel MOCK" )
                .withImagem( "Imagem Responsavel MOCK" )
                .withPerfil( perfilAdministrador )
                .withDataCriacao( LocalDate.of( 2020, 10, 1 ) )
                .withDataModificacao( LocalDate.of( 2020, 11, 11 ) )
                .withAtivo( Boolean.TRUE )
                .withSenha( "Senha Responsavel MOCK" )
                .build();
    }

    public static Usuario usuarioCriacao() {

        Perfil perfilOperador = PerfilMock.perfilOperador();

        return new Usuario().builder()
                .withId( UUID.randomUUID() )
                .withNome( "Nome Operador MOCK" )
                .withEmail( "Email Operador MOCK" )
                .withImagem( "Imagem Operador MOCK" )
                .withPerfil( perfilOperador )
                .withDataCriacao( LocalDate.of( 2020, 11, 2 ) )
                .withDataModificacao( LocalDate.of( 2020, 12, 12 ) )
                .withAtivo( Boolean.TRUE )
                .withSenha( "Senha Operador MOCK" )
                .build();
    }

}
