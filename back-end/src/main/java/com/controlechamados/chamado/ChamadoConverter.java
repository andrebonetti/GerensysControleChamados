package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoriaConverter;
import com.controlechamados.chamado.categoria.subcategoria.dto.SubCategoriaGridDTO;
import com.controlechamados.chamado.dto.ChamadoGridDTO;
import com.controlechamados.chamado.formularioinput.FormularioInputConverter;
import com.controlechamados.chamado.formularioinput.dro.FormularioInputGridDTO;
import com.controlechamados.chamado.solucaoTecnica.SolucaoTecnicaConverter;
import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaGridDTO;
import com.controlechamados.empresa.EmpresaConverter;
import com.controlechamados.empresa.dto.EmpresaGridDTO;
import com.controlechamados.fila.FilaConverter;
import com.controlechamados.fila.dto.FilaGridDTO;
import com.controlechamados.usuario.UsuarioConverter;
import com.controlechamados.usuario.dto.UsuarioGridDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ChamadoConverter {

    public static ChamadoGridDTO toGridDto(Chamado chamado) {

        SubCategoriaGridDTO subCategoriaGridDTO = SubCategoriaConverter.toGridDTO( chamado.getSubCategoria() );
        EmpresaGridDTO empresaGridDTO = EmpresaConverter.toGridDTO( chamado.getEmpresa() );
        UsuarioGridDTO usuarioCriacaoGridDTO = UsuarioConverter.toGridDto( chamado.getUsuarioCriacao() );
        UsuarioGridDTO usuarioResponsavelGridDTO = UsuarioConverter.toGridDto( chamado.getUsuarioResponsavel() );
        FilaGridDTO filaGridDTO = FilaConverter.toGridDTO( chamado.getFila() );

        List<FormularioInputGridDTO> formularioInputGridDTOList = chamado.getFormularioInput().stream()
                .map( FormularioInputConverter::toGridDto )
                .collect( Collectors.toList() );

        List<SolucaoTecnicaGridDTO> solucaoTecnicaGridDTOS = chamado.getSolucaoTecnicaChecklist().stream()
                .map( SolucaoTecnicaConverter::toGridDto )
                .collect( Collectors.toList() );

        return new ChamadoGridDTO().builder()
                .withId( chamado.getId().toString() )
                .withTitulo( chamado.getTitulo() )
                .withSubCategoria( subCategoriaGridDTO )
                .withEmpresa( empresaGridDTO )
                .withUsuarioCriacao( usuarioCriacaoGridDTO )
                .withUsuarioResponsavel( usuarioResponsavelGridDTO )
                .withFila( filaGridDTO )
                .withFormularioInput( formularioInputGridDTOList )
                .withSolucaoTecnica( solucaoTecnicaGridDTOS )
                .withDataCriacao( chamado.getDataCriacao().toString() )
                .withDataModificacao( chamado.getDataModificacao().toString() )
                .build();


    }

}
