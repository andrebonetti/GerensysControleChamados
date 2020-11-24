package com.controlechamados.models;

import com.controlechamados.models.chains.PropriedadePorAcaoChain;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.usuario.Usuario;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    public UUID id;

    public Boolean ativo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_criacao")
    public Usuario usuarioCriacao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_modificacao")
    public Usuario usuarioModificacao;

    public LocalDate dataCriacao ;
    public LocalDate dataModificacao;

    public AbstractEntity() {
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
