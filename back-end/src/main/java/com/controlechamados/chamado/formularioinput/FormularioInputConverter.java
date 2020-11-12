package com.controlechamados.chamado.formularioinput;

import com.controlechamados.chamado.formularioinput.dro.FormularioInputGridDTO;

public class FormularioInputConverter {

    public static FormularioInputGridDTO toGridDto(FormularioInput formularioInput) {

        return new FormularioInputGridDTO( formularioInput.getId().toString(),
                formularioInput.getTipo().getValue(),
                formularioInput.getValor() );

    }

}
