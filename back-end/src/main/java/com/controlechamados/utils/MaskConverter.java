package com.controlechamados.utils;

public class MaskConverter {

    public static String toNumberFormat(String text){
        return text.replaceAll("[^0-9]", "");
    }

    public static Long toNumber(String text){
        String numberFormat = toNumberFormat( text );

        return Validators.isNull(numberFormat) ? null : Long.parseLong( numberFormat );
    }

    public static String toNumberFormatNotPad(String text){
        String toNumberFormat = toNumberFormat( text );

        return toNumber(toNumberFormat).toString();
    }

}
