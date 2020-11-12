package com.controlechamados.usuario.perfil;

import java.util.UUID;

public class PerfilMock {

    public static Perfil perfilAdministrador() {
        return new Perfil( UUID.randomUUID(), "Nome Administrador MOCK" );
    }

    public static Perfil perfilOperador() {
        return new Perfil( UUID.randomUUID(), "Nome Operador MOCK" );
    }

}
