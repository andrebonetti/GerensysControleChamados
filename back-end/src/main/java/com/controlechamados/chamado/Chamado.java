package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoria;
import com.controlechamados.chamado.formularioinput.FormularioInput;
import com.controlechamados.chamado.solucaoTecnica.SolucaoTecnica;
import com.controlechamados.empresa.Empresa;
import com.controlechamados.fila.Fila;
import com.controlechamados.usuario.Usuario;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Chamado {

    private UUID id;
    private String titulo;
    private SubCategoria subCategoria;
    private Empresa empresa;
    private Usuario usuarioResponsavel;
    private Usuario usuarioCriacao;
    private Fila fila;
    private List<FormularioInput> formularioInput;
    private List<SolucaoTecnica> solucaoTecnicaChecklist;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;

    public Chamado() {
        //to serialize
    }

    private Chamado(Builder builder) {
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.subCategoria = builder.subCategoria;
        this.empresa = builder.empresa;
        this.usuarioResponsavel = builder.usuarioResponsavel;
        this.usuarioCriacao = builder.usuarioCriacao;
        this.fila = builder.fila;
        this.formularioInput = builder.formularioInput;
        this.solucaoTecnicaChecklist = builder.solucaoTecnica;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;

    }

    public static Builder builder() {
        return new Builder();
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    public Usuario getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public Fila getFila() {
        return fila;
    }

    public List<FormularioInput> getFormularioInput() {
        return formularioInput;
    }

    public List<SolucaoTecnica> getSolucaoTecnicaChecklist() {
        return solucaoTecnicaChecklist;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    public static final class Builder {

        private UUID id;
        private String titulo;
        private SubCategoria subCategoria;
        private Empresa empresa;
        private Usuario usuarioResponsavel;
        private Usuario usuarioCriacao;
        private Fila fila;
        private List<FormularioInput> formularioInput;
        private List<SolucaoTecnica> solucaoTecnica;
        private LocalDate dataCriacao;
        private LocalDate dataModificacao;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder withSubCategoria(SubCategoria subCategoria) {
            this.subCategoria = subCategoria;
            return this;
        }

        public Builder withEmpresa(Empresa empresa) {
            this.empresa = empresa;
            return this;
        }

        public Builder withUsuarioResponsavel(Usuario usuarioResponsavel) {
            this.usuarioResponsavel = usuarioResponsavel;
            return this;
        }

        public Builder withUsuarioCriacao(Usuario usuarioCriacao) {
            this.usuarioCriacao = usuarioCriacao;
            return this;
        }

        public Builder withFila(Fila fila) {
            this.fila = fila;
            return this;
        }

        public Builder withFormularioInput(List<FormularioInput> formularioInput) {
            this.formularioInput = formularioInput;
            return this;
        }

        public Builder withSolucaoTecnica(List<SolucaoTecnica> solucaoTecnica) {
            this.solucaoTecnica = solucaoTecnica;
            return this;
        }

        public Builder withDataCriacao(LocalDate dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public Builder withDataModificacao(LocalDate dataModificacao) {
            this.dataModificacao = dataModificacao;
            return this;
        }

        public Chamado build() {
            return new Chamado( this );
        }

    }
}
