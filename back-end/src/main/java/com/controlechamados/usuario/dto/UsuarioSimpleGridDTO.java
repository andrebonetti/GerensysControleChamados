package com.controlechamados.usuario.dto;

public class UsuarioSimpleGridDTO{

    private String id;
    private String nome;
    private String email;
    private String imagem;

    public UsuarioSimpleGridDTO() {
        // to serialize
    }

    public UsuarioSimpleGridDTO(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
    }

    public static Builder builder(){return new Builder();}

    public static final class Builder{

        private String id;
        private String nome;
        private String email;
        private String imagem;

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

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public UsuarioSimpleGridDTO build() {
            return new UsuarioSimpleGridDTO( this );
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

    @Override
    public String toString() {
        return "UsuarioSimpleGridDTO{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
