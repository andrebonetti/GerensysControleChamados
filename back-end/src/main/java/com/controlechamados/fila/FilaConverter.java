package com.controlechamados.fila;

import com.controlechamados.fila.dto.FilaCompleteGridDTO;
import com.controlechamados.fila.dto.FilaFormAtualizacaoDTO;
import com.controlechamados.fila.dto.FilaFormCriacaoDTO;
import com.controlechamados.fila.dto.FilaSimpleGridDTO;

public class FilaConverter {

    public static FilaCompleteGridDTO toCompleteGridDTO(Fila fila) {

        return new FilaCompleteGridDTO().builder()
                .withNome(fila.getNome())
                .withQuantidade(123)
//                TODO CALCULAR
                .withColorStyle(fila.getColorStyle())
                .withPropertiesGridDto(fila)
                .build();

    }

    public static FilaSimpleGridDTO toSimpleGridDTO(Fila fila) {

        return new FilaSimpleGridDTO().builder()
                .withNome(fila.getNome())
                .withQuantidade(123)
//                TODO CALCULAR
                .withColorStyle(fila.getColorStyle())
                .build();

    }

    public static Fila toEntity(FilaFormCriacaoDTO form) {

        return Fila.builderCreate()
                .withNome(form.getNome())
                .withColorStyle(form.getColorStyle())
                .withOrdem(20)
//                TODO CALCULAR ORDEM
                .build();
    }

    public static Fila toEntity(Fila fila, FilaFormAtualizacaoDTO form) {

        return new Fila.BuilderUpdate(fila)
                .withNome(form.getNome())
                .withColorStyle(form.getColorStyle())
                .withOrdem(21)
//                TODO CALCULAR ORDEM
                .build();
    }

}
