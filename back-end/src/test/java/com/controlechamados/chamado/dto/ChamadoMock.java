package com.controlechamados.chamado.dto;

import java.util.UUID;

public class ChamadoMock {

    public static ChamadoDTO correctChamado(){
        return new ChamadoDTO( UUID.randomUUID(),"Exemplo Titulo" );
    }
}
