package com.controlechamados.usuario;

import com.controlechamados.models.AbstractEntity;
import com.controlechamados.usuario.perfil.Perfil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuario extends AbstractEntity {

    @Column(nullable = false,updatable=false,unique=true)
    private Long cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    private String imagem;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_perfil",nullable = false)
    private Perfil perfil;

    @Column(nullable = false)
    private String senha;

    public Usuario() {
        //to serialize
    }

    public Usuario(CreateBuilder builder) {
        this.id = builder.id;
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.perfil = builder.perfil;
        this.senha = builder.senha;
    }

    public static CreateBuilder createBuilder() {
        return new CreateBuilder();
    }

    public UpdateBuilder atualizar() {
        return new UpdateBuilder(this);
    }

    private void update(UpdateBuilder builder){
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.perfil = builder.perfil;
        this.senha = builder.senha;
    }

    public static final class CreateBuilder {

        private Long id;
        private Long cpf;
        private String nome;
        private String email;
        private String imagem;
        private Perfil perfil;
        private String senha;

        public CreateBuilder() {
        }

        public CreateBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public CreateBuilder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public CreateBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public CreateBuilder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public CreateBuilder withPerfil(Perfil perfil) {
            this.perfil = perfil;
            return this;
        }

        public CreateBuilder withSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public CreateBuilder withCpf(Long cpf) {
            this.cpf = cpf;
            return this;
        }

        public Usuario build() {
            return new Usuario( this );
        }
    }

    public static final class UpdateBuilder {

        private Usuario usuario;

        private String nome;
        private String email;
        private String imagem;
        private Perfil perfil;
        private String senha;

        public UpdateBuilder(Usuario usuario) {
            this.usuario = usuario;
        }

        public UpdateBuilder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public UpdateBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UpdateBuilder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public UpdateBuilder withPerfil(Perfil perfil) {
            this.perfil = perfil;
            return this;
        }

        public UpdateBuilder withSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public Usuario build() {
            usuario.update(this);
            return usuario;
        }
    }

    public Long getCpf() {
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

    public Perfil getPerfil() {
        return perfil;
    }

    public String getSenha() {
        return senha;
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
