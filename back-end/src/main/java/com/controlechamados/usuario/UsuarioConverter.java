package com.controlechamados.usuario;

import com.controlechamados.usuario.dto.UsuarioCompleteGridDTO;
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

        PerfilGridDTO perfilGridDTO = PerfilConverter.toGridDto( usuario.getPerfil() );

        return new UsuarioCompleteGridDTO().builder()
                .withNome( usuario.getNome() )
                .withEmail( usuario.getEmail() )
                .withImagem( usuario.getImagem() )
                .withPerfilGridDTO( perfilGridDTO )
                .withPropertiesGridDto ( usuario )
                .build();

    }

}
