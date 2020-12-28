package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoriaConverter;
import com.controlechamados.chamado.categoria.subcategoria.dto.SubCategoriaGridDTO;
import com.controlechamados.chamado.dto.ChamadoFormDTO;
import com.controlechamados.chamado.dto.ChamadoGridDTO;
import com.controlechamados.empresa.EmpresaConverter;
import com.controlechamados.empresa.dto.EmpresaSimpleGridDTO;
import com.controlechamados.fila.FilaConverter;
import com.controlechamados.fila.dto.FilaCompleteGridDTO;
import com.controlechamados.usuario.UsuarioConverter;
import com.controlechamados.usuario.dto.UsuarioSimpleGridDTO;

public class ChamadoConverter {

    public static ChamadoGridDTO toGridDto(Chamado chamado) {

        SubCategoriaGridDTO subCategoriaGridDTO = SubCategoriaConverter.toGridDTO( chamado.getSubCategoria() );
        EmpresaSimpleGridDTO empresaCompleteGridDTO = EmpresaConverter.toSimpleGridDTO( chamado.getEmpresa() );
        UsuarioSimpleGridDTO usuarioCriacaoGridDTO = UsuarioConverter.toSimpleGridDto( chamado.getUsuarioCriacao() );
        FilaCompleteGridDTO filaCompleteGridDTO = FilaConverter.toCompleteGridDTO( chamado.getFila() );

//        List<FormularioInputGridDTO> formularioInputGridDTOList = chamado.getFormularioInput().stream()
//                .map( FormularioInputConverter::toGridDto )
//                .collect( Collectors.toList() );
//
//        List<SolucaoTecnicaGridDTO> solucaoTecnicaGridDTOS = chamado.getSolucaoTecnicaChecklist().stream()
//                .map( SolucaoTecnicaConverter::toGridDto )
//                .collect( Collectors.toList() );

        return new ChamadoGridDTO().builder()
                .withId( chamado.getId().toString() )
                .withTitulo( chamado.getTitulo() )
                .withSubCategoria( subCategoriaGridDTO )
                .withEmpresa(empresaCompleteGridDTO)
                .withUsuarioCriacao( usuarioCriacaoGridDTO )
                .withFila(filaCompleteGridDTO)
                .build();


    }

    public static Chamado toEntity(ChamadoFormDTO chamadoFormDTO){


        return null;
    }

}
