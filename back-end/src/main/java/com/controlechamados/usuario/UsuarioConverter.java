package com.controlechamados.usuario;

import com.controlechamados.usuario.dto.*;
import com.controlechamados.usuario.perfil.Perfil;
import com.controlechamados.usuario.perfil.PerfilConverter;
import com.controlechamados.usuario.perfil.dto.PerfilCompleteGridDTO;
import com.controlechamados.usuario.perfil.dto.PerfilSimpleGridDTO;
import com.controlechamados.utils.MaskConverter;

public class UsuarioConverter {

    public static UsuarioSimpleGridDTO toSimpleGridDto(Usuario usuario) {

        return new UsuarioSimpleGridDTO().builder()
                .withNome( usuario.getNome() )
                .withEmail( usuario.getEmail() )
                .withImagem( usuario.getImagem() )
                .withId( usuario.getId().toString() )
                .build();

    }

    public static UsuarioCompleteGridDTO toCompleteGridDto(Usuario usuario) {

        PerfilSimpleGridDTO perfilSimpleGridDTO = PerfilConverter.toSimpleGridDTO( usuario.getPerfil() );

        return new UsuarioCompleteGridDTO().builder()
                .withNome( usuario.getNome() )
                .withEmail( usuario.getEmail() )
                .withImagem( usuario.getImagem() )
                .withPerfilGridDTO( perfilSimpleGridDTO )
                .withPropertiesGridDto ( usuario )
                .build();

    }

    public static Usuario toEntity(UsuarioFormCriacaoDTO usuarioFormCriacaoDTO
            , UsuarioReferenceDTO usuarioReferenceDTO){

        return Usuario.builder()
            .withCpf( MaskConverter.toNumber(usuarioFormCriacaoDTO.getCpf()) )
            .withNome( usuarioFormCriacaoDTO.getNome() )
            .withEmail( usuarioFormCriacaoDTO.getEmail() )
            .withImagem( usuarioFormCriacaoDTO.getImagem() )
            .withSenha( usuarioFormCriacaoDTO.getSenha() )
            .withPerfil( usuarioReferenceDTO.getPerfil() )
            .build();

    }

    public static void toEntity(Usuario usuario
            , UsuarioFormAtualizacaoDTO usuarioFormAtualizacaoDTO
            , UsuarioReferenceDTO usuarioReferenceDTO){

        usuario.atualizar()
            .withNome( usuarioFormAtualizacaoDTO.getNome() )
            .withEmail( usuarioFormAtualizacaoDTO.getEmail() )
            .withImagem( usuarioFormAtualizacaoDTO.getImagem() )
            .withSenha( usuarioFormAtualizacaoDTO.getSenha() )
            .withPerfil( usuarioReferenceDTO.getPerfil() )
            .build();

    }

}
