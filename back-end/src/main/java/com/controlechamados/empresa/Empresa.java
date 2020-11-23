package com.controlechamados.empresa;

import com.controlechamados.entity.Entity;

import java.util.Objects;

public class Empresa extends Entity {

    private String imagem;
    private String nome;

    public Empresa() {
        //to serialize
    }

    public Empresa(Builder builder){
        update(builder);
    }

    private void update(Builder builder){
        this.imagem = builder.imagem;
        this.nome = builder.nome;
    }

    public static Builder builder(){
        return new Builder();
    }

    public Builder atualizar(){
        return new Builder(this);
    }

    public final static class Builder{

        private Empresa empresa;

        private String imagem;
        private String nome;

        public Builder() {
        }

        public Builder(Empresa empresa){
            this.empresa = empresa;
        }

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "imagem='" + imagem + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}
