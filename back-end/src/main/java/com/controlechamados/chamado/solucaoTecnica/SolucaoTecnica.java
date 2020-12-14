package com.controlechamados.chamado.solucaoTecnica;

import com.controlechamados.chamado.solucaoTecnica.dto.SolucaoTecnicaFormDTO;
import com.controlechamados.models.AbstractEntity;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class SolucaoTecnica extends AbstractEntity {

    private String tipo;
    private String descricao;
    private Boolean concluido;

    public SolucaoTecnica() {
        //to serialize
    }

    public SolucaoTecnica(Builder builder){
        this.tipo = builder.tipo;
        this.descricao = builder.descricao;
        this.concluido = builder.concluido;
    }

    public SolucaoTecnica(SolucaoTecnicaFormDTO solucaoTecnicaFormDTO){

        this.tipo = solucaoTecnicaFormDTO.getTipo();
        this.descricao = solucaoTecnicaFormDTO.getDescricao();

    }

    public SolucaoTecnica(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public static Builder builder(){return new Builder();}

    public static final class Builder{

        private String tipo;
        private String descricao;
        private Boolean concluido;

        public Builder withTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder withDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder withConcluido(Boolean concluido) {
            this.concluido = concluido;
            return this;
        }

        public SolucaoTecnica build(){return new SolucaoTecnica(this);}
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    @Override
    public String toString() {
        return "SolucaoTecnica{" +
                "tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificacao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}


