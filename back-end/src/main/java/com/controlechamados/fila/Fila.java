package com.controlechamados.fila;

import com.controlechamados.models.AbstractEntity;

import javax.persistence.*;

@Entity
public class Fila extends AbstractEntity {

    private String nome;
    private String colorStyle;
    private Integer ordem;

    public Fila() {
        //to serialize
    }

    private Fila(Builder builder) {
        this.nome = builder.nome;
        this.ordem = builder.ordem;
        this.colorStyle = builder.colorStyle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String nome;
        private String colorStyle;
        private Integer ordem;

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withColorStyle(String colorStyle) {
            this.colorStyle = colorStyle;
            return this;
        }

        public Builder withOrdem(Integer ordem) {
            this.ordem = ordem;
            return this;
        }

        public Fila build() {
            return new Fila( this );
        }
    }

    public String getNome() {
        return nome;
    }

    public String getColorStyle() {
        return colorStyle;
    }

    public Integer getOrdem() {
        return ordem;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "nome='" + nome + '\'' +
                ", colorStyle='" + colorStyle + '\'' +
                ", ordem=" + ordem +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificacao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                ", version=" + version +
                '}';
    }
}
