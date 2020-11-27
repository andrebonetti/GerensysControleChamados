package com.controlechamados.usuario.perfil;

import com.controlechamados.models.AbstractEntity;
import com.controlechamados.usuario.Usuario;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Perfil extends AbstractEntity {

    @Basic(optional=false)
    private String descricao;

//    @OneToMany(mappedBy = "usuario")
//    private List<Usuario> usuarios;

    public Perfil() {
        //to serialize
    }

    public Perfil(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

//    public List<Usuario> getUsuarios() {
//        return usuarios;
//    }

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
