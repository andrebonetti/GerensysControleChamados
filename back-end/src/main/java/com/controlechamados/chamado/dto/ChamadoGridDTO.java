package com.controlechamados.chamado.dto;

import com.controlechamados.chamado.categoria.subcategoria.dto.SubCategoriaGridDTO;
import com.controlechamados.chamado.formularioinput.dro.FormularioInputGridDTO;
import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaGridDTO;
import com.controlechamados.empresa.dto.EmpresaSimpleGridDTO;
import com.controlechamados.fila.dto.FilaCompleteGridDTO;
import com.controlechamados.usuario.dto.UsuarioSimpleGridDTO;

import java.util.List;

public class ChamadoGridDTO {

    private String id;
    private String titulo;
    private SubCategoriaGridDTO subCategoria;
    private EmpresaSimpleGridDTO empresa;
    private UsuarioSimpleGridDTO usuarioResponsavel;
    private UsuarioSimpleGridDTO usuarioCriacao;
    private FilaCompleteGridDTO fila;
    private List<FormularioInputGridDTO> formularioInputGridDTOs;
    private List<SolucaoTecnicaGridDTO> solucaoTecnicaChecklist;
    private String dataCriacao;
    private String dataModificacao;

    public ChamadoGridDTO() {
        //to serialize
    }

    private ChamadoGridDTO(Builder builder) {
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.subCategoria = builder.subCategoria;
        this.empresa = builder.empresa;
        this.usuarioResponsavel = builder.usuarioResponsavel;
        this.usuarioCriacao = builder.usuarioCriacao;
        this.fila = builder.fila;
        this.formularioInputGridDTOs = builder.formularioInputGridDTOs;
        this.solucaoTecnicaChecklist = builder.solucaoTecnica;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public SubCategoriaGridDTO getSubCategoria() {
        return subCategoria;
    }

    public EmpresaSimpleGridDTO getEmpresa() {
        return empresa;
    }

    public UsuarioSimpleGridDTO getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public UsuarioSimpleGridDTO getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public FilaCompleteGridDTO getFila() {
        return fila;
    }

    public List<FormularioInputGridDTO> getFormularioInputGridDTOs() {
        return formularioInputGridDTOs;
    }

    public List<SolucaoTecnicaGridDTO> getSolucaoTecnicaChecklist() {
        return solucaoTecnicaChecklist;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataModificacao() {
        return dataModificacao;
    }

    public static final class Builder {

        private String id;
        private String titulo;
        private SubCategoriaGridDTO subCategoria;
        private EmpresaSimpleGridDTO empresa;
        private UsuarioSimpleGridDTO usuarioResponsavel;
        private UsuarioSimpleGridDTO usuarioCriacao;
        private FilaCompleteGridDTO fila;
        private List<FormularioInputGridDTO> formularioInputGridDTOs;
        private List<SolucaoTecnicaGridDTO> solucaoTecnica;
        private String dataCriacao;
        private String dataModificacao;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder withSubCategoria(SubCategoriaGridDTO subCategoria) {
            this.subCategoria = subCategoria;
            return this;
        }

        public Builder withEmpresa(EmpresaSimpleGridDTO empresa) {
            this.empresa = empresa;
            return this;
        }

        public Builder withUsuarioResponsavel(UsuarioSimpleGridDTO usuarioResponsavel) {
            this.usuarioResponsavel = usuarioResponsavel;
            return this;
        }

        public Builder withUsuarioCriacao(UsuarioSimpleGridDTO usuarioCriacao) {
            this.usuarioCriacao = usuarioCriacao;
            return this;
        }

        public Builder withFila(FilaCompleteGridDTO fila) {
            this.fila = fila;
            return this;
        }

        public Builder withFormularioInput(List<FormularioInputGridDTO> formularioInputGridDTOList) {
            this.formularioInputGridDTOs = formularioInputGridDTOList;
            return this;
        }

        public Builder withSolucaoTecnica(List<SolucaoTecnicaGridDTO> solucaoTecnica) {
            this.solucaoTecnica = solucaoTecnica;
            return this;
        }

        public Builder withDataCriacao(String dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public Builder withDataModificacao(String dataModificacao) {
            this.dataModificacao = dataModificacao;
            return this;
        }

        public ChamadoGridDTO build() {
            return new ChamadoGridDTO( this );
        }

    }

    @Override
    public String toString() {
        return "ChamadoGridDTO{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", subCategoria=" + subCategoria +
                ", empresa=" + empresa +
                ", usuarioResponsavel=" + usuarioResponsavel +
                ", usuarioCriacao=" + usuarioCriacao +
                ", fila=" + fila +
                ", formularioInputGridDTOs=" + formularioInputGridDTOs +
                ", solucaoTecnicaChecklist=" + solucaoTecnicaChecklist +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", dataModificacao='" + dataModificacao + '\'' +
                '}';
    }
}
