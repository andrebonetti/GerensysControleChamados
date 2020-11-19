package com.controlechamados.empresa.dto;

public class EmpresaFormAtualizacaoDTO {

    private String id;
    private String imagem;
    private String nome;

    public EmpresaFormAtualizacaoDTO(String id, String imagem, String nome) {
        this.id = id;
        this.imagem = imagem;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "EmpresaFormAtualizacaoDTO{" +
                "id='" + id + '\'' +
                ", imagem='" + imagem + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
