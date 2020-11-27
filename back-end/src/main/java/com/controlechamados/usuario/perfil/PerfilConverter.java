package com.controlechamados.usuario.perfil;

import com.controlechamados.models.EntityConverter;
import com.controlechamados.usuario.perfil.dto.PerfilFormAtualizacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilFormCriacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilCompleteGridDTO;
import com.controlechamados.usuario.perfil.dto.PerfilSimpleGridDTO;

public class PerfilConverter {

    public static PerfilSimpleGridDTO toSimpleGridDTO(Perfil perfil) {
        return new PerfilSimpleGridDTO(perfil.getId(),perfil.getDescricao());

    }

    public static PerfilCompleteGridDTO toCompleteGridDTO(Perfil perfil) {
        return new PerfilCompleteGridDTO(perfil.getDescricao()
                ,EntityConverter.toGridDTO( perfil ));

    }

    public static Perfil toEntity(PerfilFormCriacaoDTO perfilFormCriacaoDTO) {
        return new Perfil(perfilFormCriacaoDTO.getDescricao());
    }

    public static void toEntity(Perfil perfil, PerfilFormAtualizacaoDTO perfilFormAtualizacaoDTO){
        perfil.atualizar(perfilFormAtualizacaoDTO.getDescricao());
    }

}
