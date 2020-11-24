package com.controlechamados.usuario.perfil.dto;

import com.controlechamados.models.dto.EntityGridDTO;

public class PerfilGridDTO extends EntityGridDTO {

    private String id;
    private String nome;

    public PerfilGridDTO(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "PerfilGridDTO{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
