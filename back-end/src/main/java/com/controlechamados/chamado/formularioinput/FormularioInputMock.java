package com.controlechamados.chamado.formularioinput;

import com.controlechamados.chamado.formularioinput.dro.FormularioInputFormDTO;
import com.controlechamados.chamado.formularioinput.enums.InputTypeEnum;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class FormularioInputMock {

    public static FormularioInput formularioCase1() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return new FormularioInput().builder()
                .withId( UUID.randomUUID() )
                .withTipo( InputTypeEnum.TEXT )
                .withValor( "Valor case1 Input" )
                .withUsuarioCriacao( usuarioCriacao )
                .withUsuarioModificaocao( usuarioResponsavel )
                .withDataCriacao( LocalDate.now() )
                .withDataModificacao( LocalDate.now() )
                .build();
    }

    public static FormularioInput formularioCase2() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return new FormularioInput().builder()
                .withId( UUID.randomUUID() )
                .withTipo( InputTypeEnum.TEXTAREA )
                .withValor( "Valor case2 Input" )
                .withUsuarioCriacao( usuarioCriacao )
                .withUsuarioModificaocao( usuarioResponsavel )
                .withDataCriacao( LocalDate.now() )
                .withDataModificacao( LocalDate.now() )
                .build();
    }

    public static FormularioInput formularioCase3() {

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        return new FormularioInput().builder()
                .withId( UUID.randomUUID() )
                .withTipo( InputTypeEnum.TEXT )
                .withValor( "Valor case3 Input" )
                .withUsuarioCriacao( usuarioCriacao )
                .withUsuarioModificaocao( usuarioResponsavel )
                .withDataCriacao( LocalDate.now() )
                .withDataModificacao( LocalDate.now() )
                .build();
    }

    public static List<FormularioInput> formularioCases() {
        return List.of( formularioCase1(), formularioCase2(), formularioCase3() );
    }

    public static FormularioInputFormDTO formularioFormCase1(){
        return new FormularioInputFormDTO(
                InputTypeEnum.TEXT.getValue(),
                "Valor Form case1 Input");
    }

    public static FormularioInputFormDTO formularioFormCase2(){
        return new FormularioInputFormDTO(
                InputTypeEnum.TEXTAREA.getValue(),
                "Valor Form case2 Input");
    }

    public static FormularioInputFormDTO formularioFormCase3(){
        return new FormularioInputFormDTO(
                InputTypeEnum.FILE.getValue(),
                "Valor Form case3 Input");
    }

    public static List<FormularioInputFormDTO> formularioFormCases() {
        return List.of( formularioFormCase1(), formularioFormCase2(), formularioFormCase3() );
    }
}
