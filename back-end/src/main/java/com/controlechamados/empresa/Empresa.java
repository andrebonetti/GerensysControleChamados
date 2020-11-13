package com.controlechamados.empresa;

import java.util.UUID;

public class Empresa {

    private UUID id;
    private String imagem;
    private String nome;

    public Empresa(UUID id, String imagem, String nome) {
        this.id = id;
        this.imagem = imagem;
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    public String getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", imagem='" + imagem + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
