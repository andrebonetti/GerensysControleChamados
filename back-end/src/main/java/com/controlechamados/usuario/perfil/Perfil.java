package com.controlechamados.usuario.perfil;

import com.controlechamados.models.AbstractEntity;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class Perfil extends AbstractEntity {

    private String nome;

    public Perfil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                ", nome='" + nome + '\'' +
                '}';
    }
}
