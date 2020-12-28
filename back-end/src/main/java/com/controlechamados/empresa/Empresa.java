package com.controlechamados.empresa;

import com.controlechamados.models.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Empresa extends AbstractEntity {

    @NotNull
    @Column(nullable = false)
    private Long cnpj;

    @NotNull
    @Column(nullable = false)
    private String razaoSocial;

    private String imagem;

    public Empresa() {
        //to serialize
    }

    public Empresa(CreateBuilder builder){
        this.imagem = builder.imagem;
        this.razaoSocial = builder.razaoSocial;
        this.cnpj = builder.cnpj;
    }

    private void update(UpdateBuilder updateBuilder){
        this.razaoSocial = updateBuilder.razaoSocial;
        this.imagem = updateBuilder.imagem;
    }

    public static CreateBuilder create(){
        return new CreateBuilder();
    }

    public UpdateBuilder update(){
        return new UpdateBuilder(this);
    }

    public final static class CreateBuilder{

        private Long cnpj;
        private String razaoSocial;
        private String imagem;

        public CreateBuilder() {
        }

        public CreateBuilder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public CreateBuilder withRazaoSocial(String nome) {
            this.razaoSocial = nome;
            return this;
        }

        public CreateBuilder withCnpj(Long cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Empresa build(){
            return new Empresa(this);
        }

    }

    public final static class UpdateBuilder {

        private Empresa empresa;

        private String razaoSocial;
        private String imagem;

        public UpdateBuilder(Empresa empresa){
            this.empresa = empresa;
        }

        public UpdateBuilder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public UpdateBuilder withRazaoSocial(String nome) {
            this.razaoSocial = nome;
            return this;
        }

        public Empresa build(){
            empresa.update( this );
            return empresa;
        }

    }

    public String getImagem() {
        return imagem;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public Long getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj=" + cnpj +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", imagem='" + imagem + '\'' +
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
