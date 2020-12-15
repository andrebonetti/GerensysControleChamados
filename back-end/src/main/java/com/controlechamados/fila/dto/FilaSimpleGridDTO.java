package com.controlechamados.fila.dto;

public class FilaSimpleGridDTO{

    private String nome;
    private Integer quantidade;
    private String colorStyle;

    public FilaSimpleGridDTO() {
        //to serialize
    }

    public FilaSimpleGridDTO(Builder builder) {
        this.nome = builder.nome;
        this.quantidade = builder.quantidade;
        this.colorStyle = builder.colorStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String nome;
        private Integer quantidade;
        private String colorStyle;

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public Builder withColorStyle(String colorStyle) {
            this.colorStyle = colorStyle;
            return this;
        }

        public FilaSimpleGridDTO build() {
            return new FilaSimpleGridDTO( this );
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getColorStyle() {
        return colorStyle;
    }

    @Override
    public String toString() {
        return "FilaSimpleGridDTO{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", colorStyle='" + colorStyle + '\'' +
                '}';
    }
}
