package com.controlechamados.usuario.dto;

public class UsuarioFormCriacaoDTO {

    private String cpf;
    private String nome;
    private String email;
    private String imagem;
    private String id_perfil;
    private String senha;

    public UsuarioFormCriacaoDTO() {
        //to serialize
    }

    public UsuarioFormCriacaoDTO(Builder builder){
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.id_perfil = builder.id_perfil;
        this.senha = builder.senha;
    }

    public static Builder builder(){
        return new Builder();
    }

    public final static class Builder{

        private String cpf;
        private String nome;
        private String email;
        private String imagem;
        private String id_perfil;
        private String senha;

        public Builder withCpf(String cpf) {
            this.cpf = cpf;
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

        public Builder withId_perfil(String id_perfil) {
            this.id_perfil = id_perfil;
            return this;
        }

        public Builder withSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public UsuarioFormCriacaoDTO build(){
            return new UsuarioFormCriacaoDTO( this );
        }
    }

    public String getCpf() {
        return cpf;
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

    public String getId_perfil() {
        return id_perfil;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "UsuarioFormCriacaoDTO{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", imagem='" + imagem + '\'' +
                ", id_perfil='" + id_perfil + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
