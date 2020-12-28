package com.controlechamados.utils;

public class Validators {

    public static String toNumberFormat(String text){
        return text.replaceAll("[^0-9]", "");
    }

    public static Boolean isNull(String text){
        if (text.trim().equals(""))
            return true;

        return false;
    }

}
