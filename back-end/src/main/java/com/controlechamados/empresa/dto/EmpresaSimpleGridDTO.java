package com.controlechamados.empresa.dto;

import com.controlechamados.models.BuilderEntityGridDTO;

public class EmpresaSimpleGridDTO {

    private String id;
    private String razaoSocial;
    private String imagem;

    public EmpresaSimpleGridDTO() {
        //to serialize
    }

    public EmpresaSimpleGridDTO(Builder builder){
        this.imagem = builder.imagem;
        this.razaoSocial = builder.razaoSocial;
        this.id = builder.id;
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder extends BuilderEntityGridDTO {

        private String id;
        private String razaoSocial;
        private String imagem;

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withRazaoSocial(String nome) {
            this.razaoSocial = nome;
            return this;
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public EmpresaSimpleGridDTO build(){
            return new EmpresaSimpleGridDTO(this);
        }
    }

    public String getImagem() {
        return imagem;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EmpresaSimpleGridDTO{" +
                "id='" + id + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
