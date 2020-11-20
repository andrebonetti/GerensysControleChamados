package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.interfaces.BuilderEntity;
import com.controlechamados.interfaces.Entity;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;

import java.time.LocalDate;
import java.util.UUID;

public class Empresa extends Entity {

    private String imagem;
    private String nome;

    public Empresa() {
    }

    public Empresa(Builder builder){
        this.imagem = builder.imagem;
        this.nome = builder.nome;

        this.constructor( builder );
    }

    public Empresa(EmpresaFormCriacaoDTO empresaFormCriacaoDTO){

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();

        this.nome = empresaFormCriacaoDTO.getNome();
        this.imagem = empresaFormCriacaoDTO.getImagem();

        this.id = UUID.randomUUID();
        this.ativo = Boolean.TRUE;
        this.usuarioCriacao = usuarioCriacao;
        this.dataCriacao = LocalDate.of(2020,11,19);

    }

    public void atualizar(EmpresaFormAtualizacaoDTO empresaFormAtualizacaoDTO){

        Usuario usuarioModificacao = UsuarioMock.usuarioCriacao();

        this.nome = empresaFormAtualizacaoDTO.getNome();
        this.imagem = empresaFormAtualizacaoDTO.getImagem();

        this.usuarioModificaocao = usuarioModificacao;
        this.dataModificacao = LocalDate.of(2020,11,19);
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder extends BuilderEntity {

        private String imagem;
        private String nome;

        public Builder() {
            setBuilder( this );
        }

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Empresa build(){
            return new Empresa(this);
        }
    }

    public String getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "imagem='" + imagem + '\'' +
                ", nome='" + nome + '\'' +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificaocao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}
