package com.controlechamados.models;

import com.controlechamados.empresa.Empresa;
import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;

public class EntityConverter {

    public static BuilderEntityGridDTO toGridDTO(AbstractEntity abstractEntity) {

        return new BuilderEntityGridDTO().setCompletePropertiesGridDto( abstractEntity );

    }
}
