package com.controlechamados.usuario.perfil;

import java.util.UUID;

public class Perfil {

    private UUID id;
    private String nome;

    public Perfil(UUID id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
