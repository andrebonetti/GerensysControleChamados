package com.controlechamados.chamado.solucaoTecnica;

import com.controlechamados.chamado.formularioinput.FormularioInput;
import com.controlechamados.chamado.formularioinput.dro.FormularioInputGridDTO;
import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaGridDTO;

public class SolucaoTecnicaConverter {

    public static SolucaoTecnicaGridDTO toGridDto(SolucaoTecnica solucaoTecnica){

        return new SolucaoTecnicaGridDTO(solucaoTecnica.getId().toString(),
                solucaoTecnica.getTipo(),
                solucaoTecnica.getDescricao(),
                solucaoTecnica.getConcluido());

    }

}
