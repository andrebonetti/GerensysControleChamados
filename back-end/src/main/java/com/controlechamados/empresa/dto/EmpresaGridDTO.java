package com.controlechamados.empresa.dto;

public class EmpresaGridDTO {

    private String id;
    private String imagem;
    private String nome;

    public EmpresaGridDTO(String id, String imagem, String nome) {
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
}
