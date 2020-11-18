package com.controlechamados.chamado.dto;

import com.controlechamados.chamado.formularioinput.dro.FormularioInputFormDTO;
import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaFormDTO;

import java.util.List;

public class ChamadoFormDTO {

    private String titulo;
    private String subCategoriaId;
    private String empresaId;
    private String filaId;
    private List<FormularioInputFormDTO> formularioInputFilaDTOs;
    private List<SolucaoTecnicaFormDTO> solucaoTecnicaChecklist;

    public ChamadoFormDTO() {
    }

    private ChamadoFormDTO(Builder builder){
        this.titulo = builder.titulo;
        this.subCategoriaId = builder.subCategoriaId;
        this.empresaId = builder.empresaId;
        this.filaId = builder.filaId;
        this.formularioInputFilaDTOs = builder.formularioInputFilaDTOs;
        this.solucaoTecnicaChecklist = builder.solucaoTecnicaChecklist;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder{

        private String titulo;
        private String subCategoriaId;
        private String empresaId;
        private String filaId;
        private List<FormularioInputFormDTO> formularioInputFilaDTOs;
        private List<SolucaoTecnicaFormDTO> solucaoTecnicaChecklist;

        public Builder withTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder withSubCategoriaId(String subCategoriaId) {
            this.subCategoriaId = subCategoriaId;
            return this;
        }

        public Builder withEmpresaId(String empresaId) {
            this.empresaId = empresaId;
            return this;
        }

        public Builder withFilaId(String fila) {
            this.filaId = fila;
            return this;
        }

        public Builder withFormularioInputFilaDTOs(List<FormularioInputFormDTO> formularioInputFilaDTOs) {
            this.formularioInputFilaDTOs = formularioInputFilaDTOs;
            return this;
        }

        public Builder withSolucaoTecnicaChecklist(List<SolucaoTecnicaFormDTO> solucaoTecnicaChecklist) {
            this.solucaoTecnicaChecklist = solucaoTecnicaChecklist;
            return this;
        }

        public ChamadoFormDTO build(){
            return new ChamadoFormDTO(this);
        }
    }
}
