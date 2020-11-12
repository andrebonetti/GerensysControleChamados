package com.controlechamados.chamado;

import com.controlechamados.chamado.dto.ChamadoGridDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChamadoService {

    public List<ChamadoGridDTO> findAll() {
        List<Chamado> chamados = ChamadoMock.chamadosCase();
        List<ChamadoGridDTO> chamadoGridDTOS = chamados.stream()
                .map( ChamadoConverter::toGridDto )
                .collect( Collectors.toList() );

        return chamadoGridDTOS;
    }

}
