package com.controlechamados.fila;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FilaMock {

    public static Fila filaEmAberto(){
        return new Fila().builder()
                .withId( UUID.randomUUID() )
                .withNome( "Nome Em Aberto MOCK" )
                .withCssClass( List.of("Css 1 MOCK","Css 2 MOCK") )
                .withQuantidade( 2 )
                .withColorStyle( "#ffc107" )
                .build();
    }

}
