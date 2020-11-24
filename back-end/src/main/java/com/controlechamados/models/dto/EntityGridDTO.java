package com.controlechamados.models.dto;

import com.controlechamados.models.BuilderEntityGridDTO;
import com.controlechamados.usuario.dto.UsuarioSimpleGridDTO;

public class EntityGridDTO {

    private String id;
    private String ativo;
    private UsuarioSimpleGridDTO usuarioCriacao;
    private UsuarioSimpleGridDTO usuarioModificaocao;
    private String dataCriacao;
    private String dataModificacao;

    public EntityGridDTO() {
    }

    public void construct(BuilderEntityGridDTO builderEntityGridDTO){
        this.id = builderEntityGridDTO.getId();
        this.ativo = builderEntityGridDTO.getAtivo();
        this.usuarioCriacao = builderEntityGridDTO.getUsuarioCriacao();
        this.usuarioModificaocao = builderEntityGridDTO.getUsuarioModificaocao();
        this.dataCriacao = builderEntityGridDTO.getDataCriacao();
        this.dataModificacao = builderEntityGridDTO.getDataModificacao();
    }

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

    public EntityGridDTO setId(String id) {
        this.id = id;
        return this;
    }

    public EntityGridDTO setAtivo(String ativo) {
        this.ativo = ativo;
        return this;
    }

    public EntityGridDTO setUsuarioCriacao(UsuarioSimpleGridDTO usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
        return this;
    }

    public EntityGridDTO setUsuarioModificaocao(UsuarioSimpleGridDTO usuarioModificaocao) {
        this.usuarioModificaocao = usuarioModificaocao;
        return this;
    }

    public EntityGridDTO setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
        return this;
    }

    public EntityGridDTO setDataModificacao(String dataModificacao) {
        this.dataModificacao = dataModificacao;
        return this;
    }

    @Override
    public String toString() {
        return "EntityGridDTO{" +
                "id='" + id + '\'' +
                ", ativo='" + ativo + '\'' +
                ", usuarioCriacao='" + usuarioCriacao + '\'' +
                ", usuarioModificaocao='" + usuarioModificaocao + '\'' +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", dataModificacao='" + dataModificacao + '\'' +
                '}';
    }
}
