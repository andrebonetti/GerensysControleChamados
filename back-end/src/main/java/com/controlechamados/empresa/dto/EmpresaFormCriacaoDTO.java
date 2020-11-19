package com.controlechamados.empresa.dto;

import java.util.UUID;

public class EmpresaFormCriacaoDTO {

    private String imagem;
    private String nome;

    public EmpresaFormCriacaoDTO(String imagem, String nome) {
        this.imagem = imagem;
        this.nome = nome;
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
                ", imagem='" + imagem + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
