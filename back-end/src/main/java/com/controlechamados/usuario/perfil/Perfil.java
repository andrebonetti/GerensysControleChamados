package com.controlechamados.usuario.perfil;

import java.util.UUID;

public class Perfil {

    private UUID id;
    private String nome;

    public Perfil(UUID id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
