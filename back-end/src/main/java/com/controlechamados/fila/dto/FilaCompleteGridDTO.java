package com.controlechamados.fila.dto;

import com.controlechamados.models.AbstractEntity;
import com.controlechamados.models.BuilderEntityGridDTO;
import com.controlechamados.models.dto.EntityGridDTO;

public class FilaCompleteGridDTO extends EntityGridDTO {

    private String nome;
    private Integer quantidade;
    private String colorStyle;

    public FilaCompleteGridDTO() {
        //to serialize
    }

    public FilaCompleteGridDTO(Builder builder) {
        this.nome = builder.nome;
        this.quantidade = builder.quantidade;
        this.colorStyle = builder.colorStyle;

        this.construct(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder extends BuilderEntityGridDTO {

        private String nome;
        private Integer quantidade;
        private String colorStyle;

        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public Builder withColorStyle(String colorStyle) {
            this.colorStyle = colorStyle;
            return this;
        }

        public Builder withPropertiesGridDto(AbstractEntity abstractEntity) {
            super.setCompletePropertiesGridDto( abstractEntity );
            return this;
        }

        public FilaCompleteGridDTO build() {
            return new FilaCompleteGridDTO( this );
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getColorStyle() {
        return colorStyle;
    }

    @Override
    public String toString() {
        return "FilaCompleteGridDTO{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", colorStyle='" + colorStyle + '\'' +
                ", id='" + id + '\'' +
                ", ativo='" + ativo + '\'' +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificaocao=" + usuarioModificaocao +
                ", dataCriacao='" + dataCriacao + '\'' +
                ", dataModificacao='" + dataModificacao + '\'' +
                '}';
    }
}
