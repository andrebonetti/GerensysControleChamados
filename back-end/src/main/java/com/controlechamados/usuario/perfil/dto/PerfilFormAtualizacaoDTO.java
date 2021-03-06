package com.controlechamados.usuario.perfil.dto;

public class PerfilFormAtualizacaoDTO {

    private Long id;
    private String descricao;

    public PerfilFormAtualizacaoDTO(Long id, String descricao) {
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
        return "PerfilFormAtualizacaoDTO{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
