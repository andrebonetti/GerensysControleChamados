package com.controlechamados.chamado.solucaoTecnica;

import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaFormDTO;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;

import java.time.LocalDate;
import java.util.UUID;

public class SolucaoTecnica {

    private UUID id;
    private String tipo;
    private String descricao;
    private Boolean concluido;
    private Usuario usuarioCriacao;
    private Usuario usuarioModificaocao;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;

    public SolucaoTecnica() {
        //to serialize
    }

    public SolucaoTecnica(Builder builder){
        this.id = builder.id;
        this.tipo = builder.tipo;
        this.descricao = builder.descricao;
        this.concluido = builder.concluido;
        this.usuarioCriacao = builder.usuarioCriacao;
        this.usuarioModificaocao = builder.usuarioModificaocao;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;
    }

    public SolucaoTecnica(SolucaoTecnicaFormDTO solucaoTecnicaFormDTO){

        this.tipo = solucaoTecnicaFormDTO.getTipo();
        this.descricao = solucaoTecnicaFormDTO.getDescricao();

        this.id = UUID.randomUUID();
        this.usuarioCriacao = UsuarioMock.usuarioCriacao();
        this.dataModificacao = LocalDate.now();

    }

    public SolucaoTecnica(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public static Builder builder(){return new Builder();}

    public static final class Builder{

        private UUID id;
        private String tipo;
        private String descricao;
        private Boolean concluido;
        private Usuario usuarioCriacao;
        private Usuario usuarioModificaocao;
        private LocalDate dataCriacao;
        private LocalDate dataModificacao;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder withDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder withConcluido(Boolean concluido) {
            this.concluido = concluido;
            return this;
        }

        public Builder withUsuarioCriacao(Usuario usuarioCriacao) {
            this.usuarioCriacao = usuarioCriacao;
            return this;
        }

        public Builder withUsuarioModificaocao(Usuario usuarioModificaocao) {
            this.usuarioModificaocao = usuarioModificaocao;
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

        public SolucaoTecnica build(){return new SolucaoTecnica(this);}
    }

    public UUID getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public Usuario getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public Usuario getUsuarioModificaocao() {
        return usuarioModificaocao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    @Override
    public String toString() {
        return "SolucaoTecnica{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificaocao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}


