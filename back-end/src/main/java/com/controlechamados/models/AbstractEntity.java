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
    public Long id;
//TODO RETURN    public UUID id;

    public Boolean ativo = Boolean.TRUE;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_criacao")
    public Usuario usuarioCriacao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_modificacao")
    public Usuario usuarioModificacao;

    public LocalDateTime dataCriacao = LocalDateTime.now();

    @Column(columnDefinition = "TIMESTAMP")
    public LocalDateTime dataModificacao;

    @Version
    private Long version;

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
