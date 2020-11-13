package com.controlechamados.chamado.categoria.dto;

public class CategoriaGridDTO {

    private String id;
    private String descricao;

    public CategoriaGridDTO(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "CategoriaGridDTO{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
