package com.controlechamados.models;

public class EntityConverter {

    public static BuilderEntityGridDTO toGridDTO(AbstractEntity abstractEntity) {

        return new BuilderEntityGridDTO().setCompletePropertiesGridDto( abstractEntity );

    }
}
