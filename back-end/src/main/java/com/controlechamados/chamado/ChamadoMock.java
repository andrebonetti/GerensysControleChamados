package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoria;
import com.controlechamados.chamado.categoria.subcategoria.SubCategoriaMock;
import com.controlechamados.chamado.dto.ChamadoDTO;

import java.util.UUID;

public class ChamadoMock {

    public static Chamado correctChamado() {
        SubCategoria subCategoria = SubCategoriaMock.correctSubCategoria();

        return new Chamado().builder()
               .withId( UUID.randomUUID() )
               .withTitulo( "Titulo MOCK" )
               .withSubCategoria( subCategoria )

               .build();
//               .withSubCategoria(  )
    }
}
