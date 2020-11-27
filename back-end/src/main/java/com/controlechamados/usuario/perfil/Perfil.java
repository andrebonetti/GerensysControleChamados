package com.controlechamados.usuario.perfil;

import com.controlechamados.models.AbstractEntity;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Perfil extends AbstractEntity {

    @Basic(optional=false)
    private String descricao;

    public Perfil() {
        //to serialize
    }

    public Perfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void atualizar(String nome) {
        this.descricao = nome;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                ", nome='" + descricao + '\'' +
                '}';
    }
}
