package com.controlechamados.fila.dto;

public class FilaFormCriacaoDTO {

    private String nome;
    private String colorStyle;

    public FilaFormCriacaoDTO() {
        //to serialize
    }

    public FilaFormCriacaoDTO(String nome, String colorStyle) {
        this.nome = nome;
        this.colorStyle = colorStyle;
    }

    public String getNome() {
        return nome;
    }

    public String getColorStyle() {
        return colorStyle;
    }

    @Override
    public String toString() {
        return "FilaFormCriacaoDTO{" +
                "nome='" + nome + '\'' +
                ", colorStyle='" + colorStyle + '\'' +
                '}';
    }
}
