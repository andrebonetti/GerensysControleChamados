package com.controlechamados.fila;

public class FilaMock {

    public static Fila filaEmAberto() {
        return new Fila().builder()
                .withNome( "Nome Em Aberto MOCK" )
                .withColorStyle( "#ffc107" )
                .build();
    }

    public static Fila filaEmAndamento() {
        return new Fila().builder()
                .withNome( "Nome Em Andamento MOCK" )
                .withColorStyle( "#17a2b8" )
                .build();
    }

}
