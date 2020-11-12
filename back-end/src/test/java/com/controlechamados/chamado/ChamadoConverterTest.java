package com.controlechamados.chamado;

import com.controlechamados.chamado.dto.ChamadoGridDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChamadoConverterTest {

    @Test
    void should_convert_chamado_entity_to_chamado_grid_dto() {
        Chamado chamado = ChamadoMock.chamadoCase1();
        ChamadoGridDTO chamadoGridDTO = ChamadoConverter.toGridDto( chamado );

        assertEquals( chamado.getId().toString(), chamadoGridDTO.getId() );
        assertEquals( chamado.getTitulo(), chamadoGridDTO.getTitulo() );
        assertEquals( chamado.getDataModificacao().toString(), chamadoGridDTO.getDataModificacao() );
        assertEquals( chamado.getDataCriacao().toString(), chamadoGridDTO.getDataCriacao() );
        assertTrue( chamadoGridDTO instanceof ChamadoGridDTO );
    }

}
