package com.controlechamados.fila.dto;

public class FilaFormAtualizacaoDTO {

    private Long id;
    private String nome;
    private String colorStyle;

    public FilaFormAtualizacaoDTO() {
        //to serialize
    }

    public FilaFormAtualizacaoDTO(Long id, String nome, String colorStyle) {
        this.id = id;
        this.nome = nome;
        this.colorStyle = colorStyle;
    }

    public String getNome() {
        return nome;
    }

    public String getColorStyle() {
        return colorStyle;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "FilaFormAtualizacaoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", colorStyle='" + colorStyle + '\'' +
                '}';
    }
}
