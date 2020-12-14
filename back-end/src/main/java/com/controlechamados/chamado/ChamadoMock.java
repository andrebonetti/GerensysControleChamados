package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoria;
import com.controlechamados.chamado.categoria.subcategoria.SubCategoriaMock;
import com.controlechamados.chamado.dto.ChamadoFormDTO;
import com.controlechamados.chamado.formularioinput.FormularioInput;
import com.controlechamados.chamado.formularioinput.FormularioInputMock;
import com.controlechamados.chamado.formularioinput.dro.FormularioInputFormDTO;
import com.controlechamados.chamado.solucaoTecnica.SolucaoTecnica;
import com.controlechamados.chamado.solucaoTecnica.SolucaoTecnicaMock;
import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaFormDTO;
import com.controlechamados.empresa.Empresa;
import com.controlechamados.empresa.EmpresaMock;
import com.controlechamados.fila.Fila;
import com.controlechamados.fila.FilaMock;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ChamadoMock {

    public static Chamado chamadoCase1() {

        SubCategoria subCategoria = SubCategoriaMock.correctSubCategoria();
        Empresa empresa = EmpresaMock.empresaCase1();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();
        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Fila filaEmAberto = FilaMock.filaEmAberto();
        List<FormularioInput> formularioInputs = FormularioInputMock.formularioCases();
        List<SolucaoTecnica> solucaoTecnicas = SolucaoTecnicaMock.solucaoTecnicasCases();

        return new Chamado().builder()
                .withTitulo( "Titulo MOCK" )
                .withSubCategoria( subCategoria )
                .withEmpresa( empresa )
                .withFila( filaEmAberto )
                .build();
    }

    public static List<Chamado> chamadosCase() {
        return List.of( chamadoCase1() );
    }

    public static ChamadoFormDTO chamadoFormCase1(){

        List<FormularioInputFormDTO> formularioInputFormDTOS = FormularioInputMock.formularioFormCases();
        List<SolucaoTecnicaFormDTO> solucaoTecnicaFormDTOS = SolucaoTecnicaMock.solucoesTecnicasFormCases();

        return new ChamadoFormDTO().builder()
                .withTitulo( "Titulo Form MOCK" )
                .withSubCategoriaId( UUID.randomUUID().toString() )
                .withEmpresaId( UUID.randomUUID().toString() )
                .withFilaId( UUID.randomUUID().toString() )
                .withFormularioInputFilaDTOs( formularioInputFormDTOS )
                .withSolucaoTecnicaChecklist( solucaoTecnicaFormDTOS )
                .build();

    }

}
