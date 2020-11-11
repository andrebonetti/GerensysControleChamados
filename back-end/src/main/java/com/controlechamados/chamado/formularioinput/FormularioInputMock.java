package com.controlechamados.chamado.formularioinput;

import com.controlechamados.chamado.formularioinput.enums.InputTypeEnum;

import java.util.List;
import java.util.UUID;

public class FormularioInputMock {

    public static FormularioInput formularioCase1(){
        return new FormularioInput( UUID.randomUUID(),
                InputTypeEnum.TEXT,"Valor case1 Input");
    }

    public static FormularioInput formularioCase2(){
        return new FormularioInput( UUID.randomUUID(),
                InputTypeEnum.TEXTAREA,"Valor case2 Input");
    }

    public static FormularioInput formularioCase3(){
        return new FormularioInput( UUID.randomUUID(),
                InputTypeEnum.FILE,"Valor case3 Input");
    }

    public static List<FormularioInput> formularioCases(){
        return List.of(formularioCase1(),formularioCase2(),formularioCase3());
    }

}
