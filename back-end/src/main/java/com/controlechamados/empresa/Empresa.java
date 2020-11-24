package com.controlechamados.empresa;

import com.controlechamados.models.AbstractEntity;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Empresa extends AbstractEntity {

    private Long cnpj;
    private String razaoSocial;
    private String imagem;

    public Empresa() {
        //to serialize
    }

    public Empresa(Builder builder){
        update(builder);
    }

    private void update(Builder builder){
        this.imagem = builder.imagem;
        this.razaoSocial = builder.razaoSocial;
    }

    public static Builder builder(){
        return new Builder();
    }

    public Builder atualizar(){
        return new Builder(this);
    }

    public final static class Builder{

        private Empresa empresa;

        private Long cnpj;
        private String razaoSocial;
        private String imagem;

        public Builder() {
        }

        public Builder(Empresa empresa){
            this.empresa = empresa;
        }

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withRazaoSocial(String nome) {
            this.razaoSocial = nome;
            return this;
        }

        public Builder withCnpj(Long cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Empresa build(){
            if(Objects.nonNull( empresa )){
                empresa.update( this );
                return empresa;
            }else{
                return new Empresa(this);
            }
        }

    }

    public String getImagem() {
        return imagem;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "imagem='" + imagem + '\'' +
                ", nome='" + razaoSocial + '\'' +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}
