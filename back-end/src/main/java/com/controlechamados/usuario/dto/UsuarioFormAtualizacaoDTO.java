package com.controlechamados.usuario.dto;

public class UsuarioFormAtualizacaoDTO {

    private Long id;
    private String nome;
    private String email;
    private String imagem;
    private Long idPerfil;
    private String senha;

    public UsuarioFormAtualizacaoDTO() {
        //to serialize
    }

    public UsuarioFormAtualizacaoDTO(Builder builder){
        this.id = builder.id;
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.idPerfil = builder.idPerfil;
        this.senha = builder.senha;
    }

    public static Builder builder(){
        return new Builder();
    }

    public final static class Builder{

        private Long id;
        private String nome;
        private String email;
        private String imagem;
        private Long idPerfil;
        private String senha;

        public Builder withId(Long id) {
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

        public Builder withId_perfil(Long id_perfil) {
            this.idPerfil = id_perfil;
            return this;
        }

        public Builder withSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public UsuarioFormAtualizacaoDTO build(){
            return new UsuarioFormAtualizacaoDTO( this );
        }
    }

    public Long getId() {
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

    public Long getIdPerfil() {
        return idPerfil;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "UsuarioFormAtualizacaoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", imagem='" + imagem + '\'' +
                ", idPerfil='" + idPerfil + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
