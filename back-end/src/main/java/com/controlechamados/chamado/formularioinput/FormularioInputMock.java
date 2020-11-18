package com.controlechamados.chamado.formularioinput;

import com.controlechamados.chamado.formularioinput.dro.FormularioInputFormDTO;
import com.controlechamados.chamado.formularioinput.enums.InputTypeEnum;

import java.util.List;
import java.util.UUID;

public class FormularioInputMock {

    public static FormularioInput formularioCase1() {
        return new FormularioInput( UUID.randomUUID(),
                InputTypeEnum.TEXT, "Valor case1 Input" );
    }

    public static FormularioInput formularioCase2() {
        return new FormularioInput( UUID.randomUUID(),
                InputTypeEnum.TEXTAREA, "Valor case2 Input" );
    }

    public static FormularioInput formularioCase3() {
        return new FormularioInput( UUID.randomUUID(),
                InputTypeEnum.FILE, "Valor case3 Input" );
    }

    public static List<FormularioInput> formularioCases() {
        return List.of( formularioCase1(), formularioCase2(), formularioCase3() );
    }

    public static FormularioInputFormDTO formularioFormCase1(){
        return new FormularioInputFormDTO( UUID.randomUUID().toString(),
                InputTypeEnum.TEXT.getValue(),"Valor Form case1 Input");
    }

    public static FormularioInputFormDTO formularioFormCase2(){
        return new FormularioInputFormDTO( UUID.randomUUID().toString(),
                InputTypeEnum.TEXTAREA.getValue(),"Valor Form case2 Input");
    }

    public static FormularioInputFormDTO formularioFormCase3(){
        return new FormularioInputFormDTO( UUID.randomUUID().toString(),
                InputTypeEnum.FILE.getValue(),"Valor Form case3 Input");
    }

    public static List<FormularioInputFormDTO> formularioFormCases() {
        return List.of( formularioFormCase1(), formularioFormCase2(), formularioFormCase3() );
    }
}
