package com.controlechamados.empresa;

import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class EmpresaMock {

    public static Empresa empresaCase1() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return Empresa.builder()
                .withId( UUID.randomUUID() )
                .withNome( "Nome case 1 MOCK" )
                .withImagem ( "Imagem case 1 MOCK" )
                .withUsuarioCriacao ( usuarioCriacao )
                .withUsuarioModificaocao ( usuarioResponsavel )
                .withDataCriacao ( LocalDate.now() )
                .withDataModificacao ( LocalDate.now() )
                .build();
    }

    public static Empresa empresaCase2() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return Empresa.builder()
                .withId( UUID.randomUUID() )
                .withNome( "Nome case 2 MOCK" )
                .withImagem ( "Imagem case 2 MOCK" )
                .withUsuarioCriacao ( usuarioCriacao )
                .withUsuarioModificaocao ( usuarioResponsavel )
                .withDataCriacao ( LocalDate.now() )
                .withDataModificacao ( LocalDate.now() )
                .build();
    }

    public static List<Empresa> empresaCases(){
       return List.of(empresaCase1(),empresaCase2());
    }

}
