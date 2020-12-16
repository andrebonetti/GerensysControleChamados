package com.controlechamados.models;

import com.controlechamados.models.chains.PropriedadePorAcaoChain;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.usuario.Usuario;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;
//TODO RETURN    public UUID id;

    protected Boolean ativo = Boolean.TRUE;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_criacao")
    protected Usuario usuarioCriacao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_modificacao")
    protected Usuario usuarioModificacao;

    protected LocalDateTime dataCriacao = LocalDateTime.now();

    @Column(columnDefinition = "TIMESTAMP")
    protected LocalDateTime dataModificacao;

    @Version
    protected Long version;

    public AbstractEntity() {
    }

    public Long getId() {
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

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public void inativar(){
        this.ativo = false;
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
