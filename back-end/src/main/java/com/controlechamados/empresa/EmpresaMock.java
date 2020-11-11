package com.controlechamados.empresa;

import java.util.UUID;

public class EmpresaMock {

    public static Empresa correctEmpresa(){
        return new Empresa( UUID.randomUUID(),"Imagem MOCK","Nome MOCK");
    }

}
