package com.controlechamados.chamado.categoria;

import java.util.UUID;

public class Categoria {

    private UUID id;
    private String descricao;

    public Categoria(UUID id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
