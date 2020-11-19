package com.controlechamados.historico.enums;

public enum AcaoEnum {

    CRIACAO( "CRIACAO" ),
    INATIVACAO( "INATIVACAO" ),
    ALTERACAO( "ALTERACAO" );

    private final String value;

    AcaoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
