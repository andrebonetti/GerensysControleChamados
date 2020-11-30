package com.controlechamados.usuario.dto;

import com.controlechamados.usuario.perfil.Perfil;

public class UsuarioReferenceDTO {

    private Perfil perfil;

    public UsuarioReferenceDTO() {
        // to serialize
    }

    public UsuarioReferenceDTO(Perfil perfil) {
        this.perfil = perfil;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    @Override
    public String toString() {
        return "UsuarioReferenceDTO{" +
                "perfil=" + perfil +
                '}';
    }
}
