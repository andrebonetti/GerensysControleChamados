package com.controlechamados.interfaces;

import com.controlechamados.empresa.Empresa;
import com.controlechamados.usuario.Usuario;

import java.time.LocalDate;
import java.util.UUID;

public class BuilderEntity {

    public UUID id;
    public Boolean ativo;
    public Usuario usuarioCriacao;
    public Usuario usuarioModificaocao;
    public LocalDate dataCriacao ;
    public LocalDate dataModificacao;
    private Empresa.Builder builderChield;

    public void setBuilder(Empresa.Builder builderChield) {
        this.builderChield = builderChield;
    }

    public Empresa.Builder withId(UUID id) {
        this.id = id;
        return builderChield;
    }

    public Empresa.Builder withAtivo(Boolean ativo) {
        this.ativo = ativo;
        return builderChield;
    }

    public Empresa.Builder withUsuarioCriacao(Usuario usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
        return builderChield;
    }

    public Empresa.Builder withUsuarioModificaocao(Usuario usuarioModificaocao) {
        this.usuarioModificaocao = usuarioModificaocao;
        return builderChield;
    }

    public Empresa.Builder withDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
        return builderChield;
    }

    public Empresa.Builder withDataModificacao(LocalDate dataModificacao) {
        this.dataModificacao = dataModificacao;
        return builderChield;
    }

    public Entity build(){return new Entity(this);}
}
