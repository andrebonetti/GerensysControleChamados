package com.controlechamados.chamado.dto;

public class ChamadoFilterDTO {

    private String id;

    public ChamadoFilterDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ChamadoFilterDTO{" +
                "id='" + id + '\'' +
                '}';
    }
}
