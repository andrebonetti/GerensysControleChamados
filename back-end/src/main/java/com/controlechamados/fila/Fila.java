package com.controlechamados.fila;

import java.util.List;
import java.util.UUID;

public class Fila {

    private UUID id;
    private String nome;
    private List<String> cssClass;
    private Integer quantidade;
    private String colorStyle;

    public Fila() {
        //to serialize
    }

    private Fila(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.cssClass = builder.cssClass;
        this.quantidade = builder.quantidade;
        this.colorStyle = builder.colorStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public UUID getId() {
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

    public static final class Builder {

        private UUID id;
        private String nome;
        private List<String> cssClass;
        private Integer quantidade;
        private String colorStyle;

        public Builder withId(UUID id) {
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

        public Fila build() {
            return new Fila( this );
        }
    }
}
