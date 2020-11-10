package com.controlechamados.usuario;

import com.controlechamados.empresa.Empresa;
import com.controlechamados.fila.Fila;
import com.controlechamados.usuario.perfil.Perfil;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Usuario {

    private UUID id;
    private String nome;
    private String email;
    private String imagem;
    private Perfil perfil;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private Boolean ativo;
    private String senha;

    public Usuario() {
        //serialize
    }

    public Usuario(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.perfil = builder.perfil;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;
        this.ativo = builder.ativo;
        this.senha = builder.senha;
    }


    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder{

        private UUID id;
        private String nome;
        private String email;
        private String imagem;
        private Perfil perfil;
        private LocalDate dataCriacao;
        private LocalDate dataModificacao;
        private Boolean ativo;
        private String senha;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withPerfil(Perfil perfil) {
            this.perfil = perfil;
            return this;
        }

        public Builder withEmpresas(List<Empresa> empresas) {
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

        public Builder withAtivo(Boolean ativo) {
            this.ativo = ativo;
            return this;
        }

        public Builder withSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public Usuario build(){return new Usuario(this);};
    }
}
