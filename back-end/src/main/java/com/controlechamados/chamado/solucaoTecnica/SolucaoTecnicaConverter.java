package com.controlechamados.chamado.solucaoTecnica;

import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaFormDTO;
import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaGridDTO;

public class SolucaoTecnicaConverter {

    public static SolucaoTecnicaGridDTO toGridDto(SolucaoTecnica solucaoTecnica) {

        return new SolucaoTecnicaGridDTO( solucaoTecnica.getId().toString(),
                solucaoTecnica.getTipo(),
                solucaoTecnica.getDescricao(),
                solucaoTecnica.getConcluido() );

    }

    public static SolucaoTecnica toEntityDto(SolucaoTecnicaFormDTO solucaoTecnicaFormDTO) {

        return new SolucaoTecnica(solucaoTecnicaFormDTO);

    }

}
