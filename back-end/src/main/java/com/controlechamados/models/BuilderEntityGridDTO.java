package com.controlechamados.models;

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

    public BuilderEntityGridDTO setCompletePropertiesGridDto(AbstractEntity abstractEntity) {

        this.id = abstractEntity.getId().toString();

        if (Objects.nonNull( abstractEntity.getAtivo() )) {
            this.ativo = abstractEntity.getAtivo().toString();
        }
        if (Objects.nonNull( abstractEntity.getUsuarioCriacao() )) {
            this.usuarioCriacao = UsuarioConverter.toSimpleGridDto( abstractEntity.getUsuarioCriacao() );
        }
        if (Objects.nonNull( abstractEntity.getUsuarioModificacao() )) {
            this.usuarioModificaocao = UsuarioConverter.toSimpleGridDto( abstractEntity.getUsuarioModificacao() );
        }
        if (Objects.nonNull( abstractEntity.getDataCriacao() )) {
            this.dataCriacao = abstractEntity.getDataCriacao().toString();
        }
        if (Objects.nonNull( abstractEntity.getDataModificacao() )) {
            this.dataModificacao = abstractEntity.getDataModificacao().toString();
        }

        return this;
    }

    public void withSimplePropertiesGridDto(AbstractEntity abstractEntity) {
        this.id = abstractEntity.getId().toString();
    }

    public BuilderEntityGridDTO withId(String id) {
        this.id = id;
        return this;
    }

    public BuilderEntityGridDTO withAtivo(String ativo) {
        this.ativo = ativo;
        return this;
    }

    public BuilderEntityGridDTO withUsuarioCriacao(UsuarioSimpleGridDTO usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
        return this;
    }

    public BuilderEntityGridDTO withUsuarioModificaocao(UsuarioSimpleGridDTO usuarioModificaocao) {
        this.usuarioModificaocao = usuarioModificaocao;
        return this;
    }

    public BuilderEntityGridDTO withDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
        return this;
    }

    public BuilderEntityGridDTO withDataModificacao(String dataModificacao) {
        this.dataModificacao = dataModificacao;
        return this;
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
