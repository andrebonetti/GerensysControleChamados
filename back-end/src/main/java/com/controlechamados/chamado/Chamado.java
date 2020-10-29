package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoria;
import com.controlechamados.fila.Fila;

import java.time.LocalDate;
import java.util.UUID;

public class Chamado {

    private UUID id;
    private String titulo;
    private SubCategoria subCategoria;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;

    public Chamado() {
        //to serialize
    }

    private Chamado(Builder builder){
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.subCategoria = builder.subCategoria;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;

    }

    public static Fila.Builder builder() {
        return new Fila.Builder();
    }

    public static final class Builder{

        private UUID id;
        private String titulo;
        private SubCategoria subCategoria;
        private LocalDate dataCriacao;
        private LocalDate dataModificacao;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder withSubCategoria(SubCategoria subCategoria) {
            this.subCategoria = subCategoria;
            return this;
        }

        public Builder withDataCriacao(LocalDate dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public Builder withDataModificacao(LocalDate dataModificacao) {
            this.dataModificacao = dataModificacao;
            return this;
        }

        public Chamado build(){return new Chamado(this);}

    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

}
