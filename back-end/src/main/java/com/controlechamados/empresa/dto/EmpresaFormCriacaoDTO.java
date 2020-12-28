package com.controlechamados.empresa.dto;

public class EmpresaFormCriacaoDTO {

    private String cnpj;
    private String razaoSocial;
    private String imagem;

    public EmpresaFormCriacaoDTO() {
        // to serialize
    }

    public EmpresaFormCriacaoDTO(String cnpj, String razaoSocial, String imagem) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.imagem = imagem;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getImagem() {
        return imagem;
    }

    @Override
    public String toString() {
        return "EmpresaFormCriacaoDTO{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
