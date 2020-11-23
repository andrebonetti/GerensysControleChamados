package com.controlechamados.usuario;

import com.controlechamados.entity.Entity;
import com.controlechamados.usuario.perfil.Perfil;

public class Usuario extends Entity {

    private String nome;
    private String email;
    private String imagem;
    private Perfil perfil;
    private String senha;

    public Usuario() {
        //serialize
    }

    public Usuario(Builder builder) {
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.perfil = builder.perfil;
        this.senha = builder.senha;
    }

    public static Builder builder() {
        return new Builder();
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

    public Perfil getPerfil() {
        return perfil;
    }

    public String getSenha() {
        return senha;
    }

    public static final class Builder {

        private String nome;
        private String email;
        private String imagem;
        private Perfil perfil;
        private String senha;

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

        public Builder withSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public Usuario build() {
            return new Usuario( this );
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", imagem='" + imagem + '\'' +
                ", perfil=" + perfil +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                ", ativo=" + ativo +
                ", senha='" + senha + '\'' +
                '}';
    }
}
