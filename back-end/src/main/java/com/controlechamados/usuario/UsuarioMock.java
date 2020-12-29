package com.controlechamados.usuario;

import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.usuario.perfil.Perfil;
import com.controlechamados.usuario.perfil.PerfilMock;

public class UsuarioMock {

    public static Usuario usuarioResponsavel() {
        Perfil perfilAdministrador = PerfilMock.perfilAdministrador();

        Usuario usuario = new Usuario().createBuilder()
                .withNome( "Nome Responsavel MOCK" )
                .withEmail( "Email Responsavel MOCK" )
                .withImagem( "Imagem Responsavel MOCK" )
                .withPerfil( perfilAdministrador )
                .withSenha( "Senha Responsavel MOCK" )
                .build();

        usuario.setPropriedadePorAcao( AcaoEnum.MOCK );

        return usuario;
    }

    public static Usuario usuarioCriacao() {

        Perfil perfilOperador = PerfilMock.perfilOperador();

        Usuario usuario = new Usuario().createBuilder()
                .setId(3L)
                .withNome( "Nome usuarioCriacao MOCK" )
                .withEmail( "Email usuarioCriacao MOCK" )
                .withImagem( "Imagem usuarioCriacao MOCK" )
                .withPerfil( perfilOperador )
                .withSenha( "Senha usuarioCriacao MOCK" )
                .build();

        usuario.setPropriedadePorAcao( AcaoEnum.MOCK );

        return usuario;
    }

    public static Usuario usuarioModificacao() {

        Perfil perfilOperador = PerfilMock.perfilOperador();

        Usuario usuario = new Usuario().createBuilder()
                .withNome( "Nome usuarioModificacao MOCK" )
                .withEmail( "Email usuarioModificacao MOCK" )
                .withImagem( "Imagem usuarioModificacao MOCK" )
                .withPerfil( perfilOperador )
                .withSenha( "Senha usuarioModificacao MOCK" )
                .build();

        usuario.setPropriedadePorAcao( AcaoEnum.MOCK );

        return usuario;
    }

    public static Usuario usuarioMock() {

        Perfil perfilOperador = PerfilMock.perfilOperador();

        Usuario usuario = new Usuario().createBuilder()
                .withNome( "Nome usuarioMOCK MOCK" )
                .withEmail( "Email usuarioMOCK MOCK" )
                .withImagem( "Imagem usuarioMOCK MOCK" )
                .withPerfil( perfilOperador )
                .withSenha( "Senha usuarioMOCK MOCK" )
                .build();

        usuario.setPropriedadePorAcao( AcaoEnum.MOCK );

        return usuario;
    }

}
