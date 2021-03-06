package com.controlechamados.empresa.dto;

import com.controlechamados.models.BuilderEntityGridDTO;
import com.controlechamados.models.AbstractEntity;
import com.controlechamados.models.dto.EntityGridDTO;

public class EmpresaGridDTO extends EntityGridDTO {

    private String imagem;
    private String nome;

    public EmpresaGridDTO() {
        //to serialize
    }

    public EmpresaGridDTO(Builder builder){
        this.imagem = builder.imagem;
        this.nome = builder.nome;

        this.construct(builder);
    }

    public String getImagem() {
        return imagem;
    }

    public String getNome() {
        return nome;
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder extends BuilderEntityGridDTO {

        private String imagem;
        private String nome;

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withPropertiesGridDto(AbstractEntity abstractEntity) {
            super.setCompletePropertiesGridDto( abstractEntity );
            return this;
        }

        public EmpresaGridDTO build(){
            return new EmpresaGridDTO(this);
        }
    }

    @Override
    public String toString() {
        return "EmpresaGridDTO{" +
                ", imagem='" + imagem + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
