package com.controlechamados.usuario;

import com.controlechamados.chamado.Chamado;
import com.controlechamados.chamado.categoria.subcategoria.SubCategoriaConverter;
import com.controlechamados.chamado.categoria.subcategoria.dto.SubCategoriaGridDTO;
import com.controlechamados.chamado.dto.ChamadoGridDTO;
import com.controlechamados.empresa.EmpresaConverter;
import com.controlechamados.empresa.dto.EmpresaGridDTO;
import com.controlechamados.usuario.dto.UsuarioGridDTO;
import com.controlechamados.usuario.perfil.PerfilConverter;
import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;

public class UsuarioConverter {

    public static UsuarioGridDTO toGridDto(Usuario usuario){

        PerfilGridDTO perfilGridDTO = PerfilConverter.toGridDto( usuario.getPerfil() );

        return new UsuarioGridDTO().builder()
                .withId( usuario.getId().toString())
                .withNome( usuario.getNome() )
                .withEmail( usuario.getEmail() )
                .withImagem( usuario.getImagem() )
                .withPerfilGridDTO( perfilGridDTO )
                .withDataCriacao( usuario.getDataCriacao().toString() )
                .withDataModificacao( usuario.getDataModificacao().toString() )
                .withAtivo( usuario.getAtivo() )
                .build();

    }

}
