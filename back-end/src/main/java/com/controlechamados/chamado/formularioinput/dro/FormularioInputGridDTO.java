package com.controlechamados.chamado.formularioinput.dro;

public class FormularioInputGridDTO {

    private String id;
    private String tipo;
    private String valor;

    public FormularioInputGridDTO(String id, String tipo, String valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }
}
