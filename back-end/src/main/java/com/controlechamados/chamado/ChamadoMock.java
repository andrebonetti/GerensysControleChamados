package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoria;
import com.controlechamados.chamado.categoria.subcategoria.SubCategoriaMock;
import com.controlechamados.chamado.dto.ChamadoDTO;
import com.controlechamados.chamado.formularioinput.FormularioInput;
import com.controlechamados.chamado.formularioinput.FormularioInputMock;
import com.controlechamados.chamado.solucaoTecnica.SolucaoTecnica;
import com.controlechamados.chamado.solucaoTecnica.SolucaoTecnicaMock;
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

    public static Chamado correctChamado() {

        SubCategoria subCategoria = SubCategoriaMock.correctSubCategoria();
        Empresa empresa = EmpresaMock.correctEmpresa();
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();
        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();
        Fila filaEmAberto = FilaMock.filaEmAberto();
        List<FormularioInput> formularioInputs = FormularioInputMock.formularioCases();
        List<SolucaoTecnica> solucaoTecnicas = SolucaoTecnicaMock.solucaoTecnicasCases();

        return new Chamado().builder()
                .withId( UUID.randomUUID() )
                .withTitulo( "Titulo MOCK" )
                .withSubCategoria( subCategoria )
                .withEmpresa( empresa )
                .withUsuarioResponsavel( usuarioResponsavel )
                .withUsuarioCriacao( usuarioCriacao )
                .withFila( filaEmAberto )
                .withFormularioInput( formularioInputs )
                .withSolucaoTecnica( solucaoTecnicas )
                .withDataCriacao( LocalDate.of(2020,11,1) )
                .withDataModificacao( LocalDate.of(2020,11,2) )
                .build();
    }
}
