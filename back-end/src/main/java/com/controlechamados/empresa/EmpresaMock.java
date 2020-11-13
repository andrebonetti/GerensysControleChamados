package com.controlechamados.empresa;

import java.util.List;
import java.util.UUID;

public class EmpresaMock {

    public static Empresa empresaCase1() {
        return new Empresa( UUID.randomUUID(), "Imagem MOCK", "Nome MOCK" );
    }

    public static Empresa empresaCase2() {
        return new Empresa( UUID.randomUUID(), "Imagem MOCK", "Nome MOCK" );
    }

    public static List<Empresa> empresaCases(){
       return List.of(empresaCase1(),empresaCase2());
    }

}
