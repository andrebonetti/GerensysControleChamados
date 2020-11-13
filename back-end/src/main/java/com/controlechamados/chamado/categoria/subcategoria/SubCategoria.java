package com.controlechamados.chamado.categoria.subcategoria;

import com.controlechamados.chamado.categoria.Categoria;

import java.util.UUID;

public class SubCategoria {

    private UUID id;
    private Categoria categoria;
    private String descricao;

    public SubCategoria(UUID id, Categoria categoria, String descricao) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public UUID getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "SubCategoria{" +
                "id=" + id +
                ", categoria=" + categoria +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
