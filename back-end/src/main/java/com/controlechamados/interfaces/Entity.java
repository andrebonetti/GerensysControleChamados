package com.controlechamados.interfaces;

import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.UUID;

public class Entity {

    public UUID id;
    public Boolean ativo;
    public Usuario usuarioCriacao;
    public Usuario usuarioModificaocao;
    public LocalDate dataCriacao ;
    public LocalDate dataModificacao;

    public Entity() {
    }

    public Entity(BuilderEntity builderEntity) {
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

    public Usuario getUsuarioModificaocao() {
        return usuarioModificaocao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    public void inativar(){
        Usuario usuarioResponsavel = UsuarioMock.usuarioResponsavel();

        this.ativo = Boolean.FALSE;
        this.usuarioCriacao = usuarioResponsavel;
        this.dataModificacao = LocalDate.now();
    }

    public void constructor(BuilderEntity builder){
        this.id = builder.id;
        this.ativo = builder.ativo;
        this.usuarioCriacao = builder.usuarioCriacao;
        this.usuarioModificaocao = builder.usuarioModificaocao;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificaocao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}
