package com.controlechamados.usuario.dto;

import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;

public class UsuarioGridDTO {

    private String id;
    private String nome;
    private String email;
    private String imagem;
    private PerfilGridDTO perfilGridDTO;
    private String dataCriacao;
    private String dataModificacao;
    private Boolean ativo;

    public UsuarioGridDTO() {
        // to serialize
    }

    public UsuarioGridDTO(Builder builder){

        this.id = builder.id;
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.perfilGridDTO = builder.perfilGridDTO;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;
        this.ativo = builder.ativo;

    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder{

        private String id;
        private String nome;
        private String email;
        private String imagem;
        private PerfilGridDTO perfilGridDTO;
        private String dataCriacao;
        private String dataModificacao;
        private Boolean ativo;

        public Builder withId(String id) {
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

        public Builder withPerfilGridDTO(PerfilGridDTO perfilGridDTO) {
            this.perfilGridDTO = perfilGridDTO;
            return this;
        }

        public Builder withDataCriacao(String dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public Builder withDataModificacao(String dataModificacao) {
            this.dataModificacao = dataModificacao;
            return this;
        }

        public Builder withAtivo(Boolean ativo) {
            this.ativo = ativo;
            return this;
        }

        public UsuarioGridDTO build(){
            return new UsuarioGridDTO(this);
        }

    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getImagem() {
        return imagem;
    }

    public PerfilGridDTO getPerfilGridDTO() {
        return perfilGridDTO;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataModificacao() {
        return dataModificacao;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
