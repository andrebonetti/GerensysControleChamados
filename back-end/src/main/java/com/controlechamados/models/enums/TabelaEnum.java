package com.controlechamados.models.enums;

public enum TabelaEnum {

    CHAMADO( "CHAMADO" ),
    CATEGORIA( "CATEGORIA" ),
    SUBCATEGORIA( "SUBCATEGORIA" ),
    FORMULARIOINPUT( "FORMULARIOINPUT" ),
    SOLUCAOTECNICA( "SOLUCAOTECNICA" ),
    USUARIO( "USUARIO" ),
    EMPRESA( "EMPRESA" );

    private final String value;

    TabelaEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
