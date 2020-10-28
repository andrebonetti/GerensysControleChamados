package com.controlechamados.chamado.dto;

import java.util.UUID;

public class ChamadoDTO {

    private UUID id;
    private String titulo;

    public ChamadoDTO(UUID id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }
}
