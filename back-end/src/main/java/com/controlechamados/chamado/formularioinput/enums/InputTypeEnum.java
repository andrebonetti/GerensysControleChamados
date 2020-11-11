package com.controlechamados.chamado.formularioinput.enums;

public enum InputTypeEnum {

	TEXTAREA("textArea"),
    TEXT  ("text"),
    FILE  ("file");

    private final String value;

    InputTypeEnum(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
	
}
