package com.controlechamados.chamado;

import com.controlechamados.chamado.categoria.subcategoria.SubCategoria;
import com.controlechamados.chamado.formularioinput.FormularioInput;
import com.controlechamados.chamado.solucaoTecnica.SolucaoTecnica;
import com.controlechamados.empresa.Empresa;
import com.controlechamados.fila.Fila;
import com.controlechamados.models.AbstractEntity;
import com.controlechamados.usuario.Usuario;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
public class Chamado extends AbstractEntity {

    private String titulo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_sub_categoria")
    private SubCategoria subCategoria;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_fila")
    private Fila fila;
//    private List<FormularioInput> formularioInput;
//    private List<SolucaoTecnica> solucaoTecnicaChecklist;

    public Chamado() {
        //to serialize
    }

    private Chamado(Builder builder) {
        this.titulo = builder.titulo;
        this.subCategoria = builder.subCategoria;
        this.empresa = builder.empresa;
        this.fila = builder.fila;
    }

    public static Builder builder() {
        return new Builder();
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

    public Fila getFila() {
        return fila;
    }

    public static final class Builder {

        private String titulo;
        private SubCategoria subCategoria;
        private Empresa empresa;
        private Fila fila;

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

        public Builder withFila(Fila fila) {
            this.fila = fila;
            return this;
        }

        public Chamado build() {
            return new Chamado( this );
        }

    }

    @Override
    public String toString() {
        return "Chamado{" +
                "titulo='" + titulo + '\'' +
                ", subCategoria=" + subCategoria +
                ", empresa=" + empresa +
                ", fila=" + fila +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificacao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }

    public void alterarFila(Fila fila){

        this.fila = fila;

    }
}
