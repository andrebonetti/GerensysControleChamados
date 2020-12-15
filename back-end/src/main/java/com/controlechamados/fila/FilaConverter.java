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

        return Fila.builder()
                .withNome(form.getNome())
                .withColorStyle(form.getColorStyle())
                .withOrdem(1)
//                TODO CALCULAR ORDEM
                .build();
    }

    public static Fila toEntity(Fila fila, FilaFormAtualizacaoDTO form) {

//        TODO CONVERTER UPDT
        return Fila.builder()
                .withNome(form.getNome())
                .withColorStyle(form.getColorStyle())
                .withOrdem(1)
//                TODO CALCULAR ORDEM
                .build();
    }

}
