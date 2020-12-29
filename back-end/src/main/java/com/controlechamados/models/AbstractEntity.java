package com.controlechamados.models;

import com.controlechamados.models.chains.PropriedadePorAcaoChain;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioRepository;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;

    @NotNull
    @Column(nullable = false)
    protected Boolean ativo = Boolean.TRUE;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_criacao")
    protected Usuario usuarioCriacao;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario_modificacao")
    protected Usuario usuarioModificacao;

    @NotNull
    @Column(nullable = false)
    protected LocalDateTime dataCriacao = LocalDateTime.now();

    @Column(columnDefinition = "TIMESTAMP")
    protected LocalDateTime dataModificacao;

    @NotNull
    @Column(nullable = false)
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

    public Long getVersion() {
        return version;
    }

    public void setUsuarioCriacao(Usuario usuario){
        this.usuarioCriacao = usuario;
    }

    public void inativar(){
        this.ativo = false;
    }

    public void setPropriedadePorAcao(AcaoEnum acaoEnum, UsuarioRepository usuarioDAO){
        PropriedadePorAcaoChain.validar( this, acaoEnum, usuarioDAO );
    }

    public void setPropriedadePorAcao(AcaoEnum acaoEnum){
        PropriedadePorAcaoChain.validar( this, acaoEnum, null );
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
