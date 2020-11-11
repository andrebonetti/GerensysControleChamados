package com.controlechamados.chamado.solucaoTecnica;

import java.util.List;
import java.util.UUID;

public class SolucaoTecnicaMock {

    public static SolucaoTecnica solucaoTecnicaCase1(){

        return new SolucaoTecnica( UUID.randomUUID(),
                "Tipo Case1 MOCK",
                "Descricao Case1 MOCK",
                Boolean.TRUE);

    }

    public static SolucaoTecnica solucaoTecnicaCase2(){

        return new SolucaoTecnica( UUID.randomUUID(),
                "Tipo Case2 MOCK",
                "Descricao Case2 MOCK",
                Boolean.TRUE);

    }

    public static SolucaoTecnica solucaoTecnicaCase3(){

        return new SolucaoTecnica( UUID.randomUUID(),
                "Tipo Case3 MOCK",
                "Descricao Case3 MOCK",
                Boolean.TRUE);

    }

    public static List<SolucaoTecnica> solucaoTecnicasCases(){

        return List.of(solucaoTecnicaCase1(),solucaoTecnicaCase2(),solucaoTecnicaCase3());

    }

}
