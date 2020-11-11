package com.controlechamados.chamado.formularioinput;

import com.controlechamados.chamado.formularioinput.enums.InputTypeEnum;

import java.util.UUID;

public class FormularioInput {

    private UUID id;
    private InputTypeEnum tipo;
    private String valor;

    public FormularioInput(UUID id, InputTypeEnum tipo, String valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
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
}
