package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;

import java.time.LocalDate;
import java.util.UUID;

public class Empresa {

    private UUID id;
    private String imagem;
    private String nome;
    private Usuario usuarioCriacao;
    private Usuario usuarioModificaocao;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;

    public Empresa() {
    }

    public Empresa(Builder builder){
        this.id = builder.id;
        this.imagem = builder.imagem;
        this.nome = builder.nome;
        this.usuarioCriacao = builder.usuarioCriacao;
        this.usuarioModificaocao = builder.usuarioModificaocao;
        this.dataCriacao = builder.dataCriacao;
        this.dataModificacao = builder.dataModificacao;
    }

    public Empresa(EmpresaFormCriacaoDTO empresaFormCriacaoDTO){

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();

        this.nome = empresaFormCriacaoDTO.getNome();
        this.imagem = empresaFormCriacaoDTO.getImagem();

        this.id = UUID.randomUUID();
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

    public final static class Builder{

        private UUID id;
        private String imagem;
        private String nome;
        private Usuario usuarioCriacao;
        private Usuario usuarioModificaocao;
        private LocalDate dataCriacao;
        private LocalDate dataModificacao;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withUsuarioCriacao(Usuario usuarioCriacao) {
            this.usuarioCriacao = usuarioCriacao;
            return this;
        }

        public Builder withUsuarioModificaocao(Usuario usuarioModificaocao) {
            this.usuarioModificaocao = usuarioModificaocao;
            return this;
        }

        public Builder withDataCriacao(LocalDate dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public Builder withDataModificacao(LocalDate dataModificacao) {
            this.dataModificacao = dataModificacao;
            return this;
        }

        public Empresa build(){
            return new Empresa(this);
        }
    }

    public UUID getId() {
        return id;
    }

    public String getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
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
}
