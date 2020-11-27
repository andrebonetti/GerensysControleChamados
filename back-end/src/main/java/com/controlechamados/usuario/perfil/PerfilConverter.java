package com.controlechamados.usuario.perfil;

import com.controlechamados.models.EntityConverter;
import com.controlechamados.usuario.perfil.dto.PerfilFormAtualizacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilFormCriacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;

public class PerfilConverter {

    public static PerfilGridDTO toSimpleGridDTO(Perfil perfil) {
        return new PerfilGridDTO(perfil.getDescricao());

    }

    public static PerfilGridDTO toCompleteGridDTO(Perfil perfil) {
        return new PerfilGridDTO(perfil.getDescricao()
                ,EntityConverter.toGridDTO( perfil ));

    }

    public static Perfil toEntity(PerfilFormCriacaoDTO perfilFormCriacaoDTO) {
        return new Perfil(perfilFormCriacaoDTO.getDescricao());
    }

    public static void toEntity(Perfil perfil, PerfilFormAtualizacaoDTO perfilFormAtualizacaoDTO){
        perfil.atualizar(perfilFormAtualizacaoDTO.getDescricao());
    }

}
