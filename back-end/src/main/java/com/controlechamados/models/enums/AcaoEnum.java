package com.controlechamados.models.enums;

public enum AcaoEnum {

    CRIACAO( "CRIACAO" ),
    INATIVACAO( "INATIVACAO" ),
    MOCK( "MOCK" ),
    ATUALIZACAO( "ATUALIZACAO" );

    private final String value;

    AcaoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
