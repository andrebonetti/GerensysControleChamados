package com.controlechamados.usuario.perfil;

import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;

public class PerfilConverter {

    public static PerfilGridDTO toGridDto(Perfil perfil){

        return new PerfilGridDTO( perfil.getId().toString(),
                perfil.getNome());

    }

}
