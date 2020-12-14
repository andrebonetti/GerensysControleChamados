package com.controlechamados.chamado.formularioinput;

import com.controlechamados.chamado.formularioinput.enums.InputTypeEnum;
import com.controlechamados.models.AbstractEntity;
import com.controlechamados.usuario.Usuario;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class FormularioInput extends AbstractEntity {

    private InputTypeEnum tipo;
    private String valor;

    public FormularioInput() {
    }

    public FormularioInput(Builder builder){
        this.tipo = builder.tipo;
        this.valor = builder.valor;
    }

    public static Builder builder(){return new Builder();}

    public static final class Builder{

        private InputTypeEnum tipo;
        private String valor;

        public Builder withTipo(InputTypeEnum tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder withValor(String valor) {
            this.valor = valor;
            return this;
        }

        public FormularioInput build(){
            return new FormularioInput(this);
        }
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

}
