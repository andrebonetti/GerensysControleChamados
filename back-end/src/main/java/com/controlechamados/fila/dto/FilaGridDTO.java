package com.controlechamados.fila.dto;

import java.util.List;

public class FilaGridDTO {

    private String id;
    private String nome;
    private List<String> cssClass;
    private Integer quantidade;
    private String colorStyle;

    public FilaGridDTO() {
        //to serialize
    }

    public FilaGridDTO(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.cssClass = builder.cssClass;
        this.quantidade = builder.quantidade;
        this.colorStyle = builder.colorStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String id;
        private String nome;
        private List<String> cssClass;
        private Integer quantidade;
        private String colorStyle;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withCssClass(List<String> cssClass) {
            this.cssClass = cssClass;
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

        public FilaGridDTO build() {
            return new FilaGridDTO( this );
        }
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getCssClass() {
        return cssClass;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getColorStyle() {
        return colorStyle;
    }

    @Override
    public String toString() {
        return "FilaGridDTO{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cssClass=" + cssClass +
                ", quantidade=" + quantidade +
                ", colorStyle='" + colorStyle + '\'' +
                '}';
    }
}
