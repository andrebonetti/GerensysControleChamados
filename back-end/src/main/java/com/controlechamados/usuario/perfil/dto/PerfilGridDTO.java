package com.controlechamados.usuario.perfil.dto;

public class PerfilGridDTO {

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
}
