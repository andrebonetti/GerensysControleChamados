package com.controlechamados.chamado.dto;

public class ChamadoFormUpdFilaDTO {

    private String id;
    private String filaId;

    public ChamadoFormUpdFilaDTO() {
    }

    public ChamadoFormUpdFilaDTO(String id, String filaId) {
        this.id = id;
        this.filaId = filaId;
    }

    public String getId() {
        return id;
    }

    public String getFilaId() {
        return filaId;
    }

    @Override
    public String toString() {
        return "ChamadoFormUpdFilaDTO{" +
                "id='" + id + '\'' +
                ", filaId='" + filaId + '\'' +
                '}';
    }
}
