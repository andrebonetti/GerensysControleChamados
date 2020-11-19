package com.controlechamados.chamado.formularioinput.dro;

public class FormularioInputFormDTO {

    private String tipo;
    private String valor;

    public FormularioInputFormDTO(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "FormularioInputGridDTO{" +
                ", tipo='" + tipo + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
