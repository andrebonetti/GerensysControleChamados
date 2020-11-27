package com.controlechamados.usuario;

import com.controlechamados.usuario.dto.UsuarioCompleteGridDTO;
import com.controlechamados.usuario.dto.UsuarioFormAtualizacaoDTO;
import com.controlechamados.usuario.dto.UsuarioFormCriacaoDTO;
import com.controlechamados.usuario.dto.UsuarioSimpleGridDTO;
import com.controlechamados.usuario.perfil.PerfilConverter;
import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;

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

        PerfilGridDTO perfilGridDTO = new PerfilConverter().toCompleteGridDTO( usuario.getPerfil() );

        return new UsuarioCompleteGridDTO().builder()
                .withNome( usuario.getNome() )
                .withEmail( usuario.getEmail() )
                .withImagem( usuario.getImagem() )
                .withPerfilGridDTO( perfilGridDTO )
                .withPropertiesGridDto ( usuario )
                .build();

    }

    public static Usuario toEntity(UsuarioFormCriacaoDTO usuarioFormCriacaoDTO){

        return Usuario.builder()
            .withCpf( Long.parseLong( usuarioFormCriacaoDTO.getCpf()) )
            .withNome( usuarioFormCriacaoDTO.getNome() )
            .withEmail( usuarioFormCriacaoDTO.getEmail() )
            .withImagem( usuarioFormCriacaoDTO.getImagem() )
            .withSenha( usuarioFormCriacaoDTO.getSenha() )
            .build();

    }

    public static void toEntity(Usuario usuario, UsuarioFormAtualizacaoDTO usuarioFormAtualizacaoDTO){

        usuario.atualizar()
            .withCpf( Long.parseLong( usuarioFormAtualizacaoDTO.getCpf()) )
            .withNome( usuarioFormAtualizacaoDTO.getNome() )
            .withEmail( usuarioFormAtualizacaoDTO.getEmail() )
            .withImagem( usuarioFormAtualizacaoDTO.getImagem() )
            .withSenha( usuarioFormAtualizacaoDTO.getSenha() )
            .build();

    }

}
