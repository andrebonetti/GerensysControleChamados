package com.controlechamados.chamado.formularioinput;

import com.controlechamados.chamado.formularioinput.enums.InputTypeEnum;
import com.controlechamados.usuario.Usuario;

import java.time.LocalDate;
import java.util.UUID;

public class FormularioInput {

    private UUID id;
    private InputTypeEnum tipo;
    private String valor;
    private Usuario usuarioCriacao;
    private Usuario usuarioModificaocao;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;

    public FormularioInput() {
    }

    public FormularioInput(Builder builder){
        this.id = builder.id;
        this.tipo = builder.tipo;
        this.valor = builder.valor;
        this.usuarioCriacao = builder.usuarioCriacao;
        this.usuarioModificaocao = builder.usuarioModificaocao;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;
    }

    public static Builder builder(){return new Builder();}

    public static final class Builder{

        private UUID id;
        private InputTypeEnum tipo;
        private String valor;
        private Usuario usuarioCriacao;
        private Usuario usuarioModificaocao;
        private LocalDate dataCriacao;
        private LocalDate dataModificacao;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withTipo(InputTypeEnum tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder withValor(String valor) {
            this.valor = valor;
            return this;
        }

        public Builder withUsuarioCriacao(Usuario usuarioCriacao) {
            this.usuarioCriacao = usuarioCriacao;
            return this;
        }

        public Builder withUsuarioModificaocao(Usuario usuarioModificaocao) {
            this.usuarioModificaocao = usuarioModificaocao;
            return this;
        }

        public Builder withDataCriacao(LocalDate dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public Builder withDataModificacao(LocalDate dataModificacao) {
            this.dataModificacao = dataModificacao;
            return this;
        }

        public FormularioInput build(){
            return new FormularioInput(this);
        }
    }

    public UUID getId() {
        return id;
    }

    public InputTypeEnum getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public Usuario getUsuarioModificaocao() {
        return usuarioModificaocao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }
}
