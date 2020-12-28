package com.controlechamados.empresa.dto;

public class EmpresaFormAtualizacaoDTO {

    private String id;
    private String imagem;
    private String razaoSocial;

    public EmpresaFormAtualizacaoDTO(String id, String imagem, String razaoSocial) {
        this.id = id;
        this.imagem = imagem;
        this.razaoSocial = razaoSocial;
    }

    public String getId() {
        return id;
    }

    public String getImagem() {
        return imagem;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    @Override
    public String toString() {
        return "EmpresaFormAtualizacaoDTO{" +
                "id='" + id + '\'' +
                ", imagem='" + imagem + '\'' +
                ", nome='" + razaoSocial + '\'' +
                '}';
    }
}
