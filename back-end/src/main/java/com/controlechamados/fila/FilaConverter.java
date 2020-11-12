package com.controlechamados.fila;

import com.controlechamados.fila.dto.FilaGridDTO;

public class FilaConverter {

    public static FilaGridDTO toGridDTO(Fila fila) {

        return new FilaGridDTO().builder()
                .withId( fila.getId().toString() )
                .withNome( fila.getNome() )
                .withCssClass( fila.getCssClass() )
                .withQuantidade( fila.getQuantidade() )
                .withColorStyle( fila.getColorStyle() )
                .build();

    }

}
