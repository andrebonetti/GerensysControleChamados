package com.controlechamados.chamado.categoria.subcategoria;

import com.controlechamados.chamado.categoria.Categoria;
import com.controlechamados.models.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class SubCategoria extends AbstractEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    private String descricao;

    public SubCategoria(Categoria categoria, String descricao) {
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "SubCategoria{" +
                "categoria=" + categoria +
                ", descricao='" + descricao + '\'' +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificacao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}
