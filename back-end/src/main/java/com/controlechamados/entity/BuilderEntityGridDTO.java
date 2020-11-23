package com.controlechamados.entity;

import com.controlechamados.usuario.UsuarioConverter;
import com.controlechamados.usuario.dto.UsuarioSimpleGridDTO;

import java.util.Objects;

public class BuilderEntityGridDTO {

    private String id;
    private String ativo;
    private UsuarioSimpleGridDTO usuarioCriacao;
    private UsuarioSimpleGridDTO usuarioModificaocao;
    private String dataCriacao;
    private String dataModificacao;

    public String getId() {
        return id;
    }

    public String getAtivo() {
        return ativo;
    }

    public UsuarioSimpleGridDTO getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public UsuarioSimpleGridDTO getUsuarioModificaocao() {
        return usuarioModificaocao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDataModificacao() {
        return dataModificacao;
    }

    public void setCompletePropertiesGridDto(Entity entity) {

        this.id = entity.getId().toString();

        if (Objects.nonNull( entity.getAtivo() )) {
            this.ativo = entity.getAtivo().toString();
        }
        if (Objects.nonNull( entity.getUsuarioCriacao() )) {
            this.usuarioCriacao = UsuarioConverter.toSimpleGridDto( entity.getUsuarioCriacao() );
        }
        if (Objects.nonNull( entity.getUsuarioModificacao() )) {
            this.usuarioModificaocao = UsuarioConverter.toSimpleGridDto( entity.getUsuarioModificacao() );
        }
        if (Objects.nonNull( entity.getDataCriacao() )) {
            this.dataCriacao = entity.getDataCriacao().toString();
        }
        if (Objects.nonNull( entity.getDataModificacao() )) {
            this.dataModificacao = entity.getDataModificacao().toString();
        }
    }

    public void setSimplePropertiesGridDto(Entity entity) {
        this.id = entity.getId().toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BuilderEntityGridDTO{" +
                "id='" + id + '\'' +
                ", ativo='" + ativo + '\'' +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificaocao +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", dataModificacao='" + dataModificacao + '\'' +
                '}';
    }
}
