package com.controlechamados.empresa.dto;

import com.controlechamados.models.BuilderEntityGridDTO;
import com.controlechamados.models.AbstractEntity;
import com.controlechamados.models.dto.EntityGridDTO;

public class EmpresaCompleteGridDTO extends EntityGridDTO {

    private String cnpj;
    private String razaoSocial;
    private String imagem;

    public EmpresaCompleteGridDTO() {
        //to serialize
    }

    public EmpresaCompleteGridDTO(Builder builder){
        this.imagem = builder.imagem;
        this.razaoSocial = builder.razaoSocial;
        this.cnpj = builder.cnpj;

        this.construct(builder);
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder extends BuilderEntityGridDTO {

        private String cnpj;
        private String razaoSocial;
        private String imagem;

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withRazaoSocial(String nome) {
            this.razaoSocial = nome;
            return this;
        }

        public Builder withCnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder withPropertiesGridDto(AbstractEntity abstractEntity) {
            super.setCompletePropertiesGridDto( abstractEntity );
            return this;
        }

        public EmpresaCompleteGridDTO build(){
            return new EmpresaCompleteGridDTO(this);
        }
    }

    public String getImagem() {
        return imagem;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "EmpresaCompleteGridDTO{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", imagem='" + imagem + '\'' +
                ", id='" + id + '\'' +
                ", ativo='" + ativo + '\'' +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificaocao +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", dataModificacao='" + dataModificacao + '\'' +
                '}';
    }
}
