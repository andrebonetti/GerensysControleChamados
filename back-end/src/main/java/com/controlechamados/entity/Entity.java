package com.controlechamados.entity;

import com.controlechamados.entity.chains.PropriedadePorAcaoChain;
import com.controlechamados.entity.enums.AcaoEnum;
import com.controlechamados.usuario.Usuario;

import java.time.LocalDate;
import java.util.UUID;

public class Entity {

    public UUID id;
    public Boolean ativo;
    public Usuario usuarioCriacao;
    public Usuario usuarioModificacao;
    public LocalDate dataCriacao ;
    public LocalDate dataModificacao;

    public Entity() {
    }

    public UUID getId() {
        return id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Usuario getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public Usuario getUsuarioModificacao() {
        return usuarioModificacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    public void setPropriedadePorAcao(AcaoEnum acaoEnum){
        PropriedadePorAcaoChain.validar( this, acaoEnum );
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}
