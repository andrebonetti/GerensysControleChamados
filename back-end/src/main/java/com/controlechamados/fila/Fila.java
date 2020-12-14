package com.controlechamados.fila;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Entity
public class Fila {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String nome;
    private String cssClass;
    private Integer quantidade;
    private String colorStyle;

    public Fila() {
        //to serialize
    }

    private Fila(Builder builder) {
        this.nome = builder.nome;
        this.cssClass = builder.cssClass;
        this.quantidade = builder.quantidade;
        this.colorStyle = builder.colorStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private Long id;
        private String nome;
        private String cssClass;
        private Integer quantidade;
        private String colorStyle;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withCssClass(String cssClass) {
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

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCssClass() {
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
        return "Fila{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cssClass=" + cssClass +
                ", quantidade=" + quantidade +
                ", colorStyle='" + colorStyle + '\'' +
                '}';
    }
}
