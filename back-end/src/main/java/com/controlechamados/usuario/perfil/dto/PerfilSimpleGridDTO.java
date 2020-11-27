package com.controlechamados.usuario.perfil.dto;

public class PerfilSimpleGridDTO{

    private Long id;
    private String descricao;

    public PerfilSimpleGridDTO(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "PerfilSimpleGridDTO{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
