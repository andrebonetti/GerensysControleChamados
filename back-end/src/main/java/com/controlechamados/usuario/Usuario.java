package com.controlechamados.usuario;

import com.controlechamados.models.AbstractEntity;
import com.controlechamados.usuario.perfil.Perfil;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Usuario extends AbstractEntity {

    private Long cpf;
    private String nome;
    private String email;
    private String imagem;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;

    private String senha;

    public Usuario() {
        //to serialize
    }

    public Usuario(Builder builder) {
        update( builder );
    }

    public static Builder builder() {
        return new Builder();
    }

    public Builder atualizar() {
        return new Builder(this);
    }

    private void update(Builder builder){
        this.cpf = builder.cpf;
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.perfil = builder.perfil;
        this.senha = builder.senha;
    }

    public static final class Builder {

        private Usuario usuario;

        private Long cpf;
        private String nome;
        private String email;
        private String imagem;
        private Perfil perfil;
        private String senha;

        public Builder() {
        }

        public Builder(Usuario usuario) {
            this.usuario = usuario;
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

        public Builder withSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public Builder withCpf(Long cpf) {
            this.cpf = cpf;
            return this;
        }

        public Usuario build() {
            if(Objects.nonNull( usuario )){
                usuario.update(this);
                return usuario;
            }else {
                return new Usuario( this );
            }
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
