package com.controlechamados.fila;

import java.util.List;
import java.util.UUID;

public class FilaMock {

    public static Fila filaEmAberto() {
        return new Fila().builder()
                .withId( UUID.randomUUID() )
                .withNome( "Nome Em Aberto MOCK" )
                .withCssClass( List.of( "Css 1 MOCK", "Css 2 MOCK" ) )
                .withQuantidade( 2 )
                .withColorStyle( "#ffc107" )
                .build();
    }

    public static Fila filaEmAndamento() {
        return new Fila().builder()
                .withId( UUID.randomUUID() )
                .withNome( "Nome Em Andamento MOCK" )
                .withCssClass( List.of( "Css 3 MOCK", "Css 4 MOCK" ) )
                .withQuantidade( 1 )
                .withColorStyle( "#17a2b8" )
                .build();
    }

}
