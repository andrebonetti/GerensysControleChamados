package com.controlechamados.historico;

import com.controlechamados.historico.dto.HistoricoGridDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoricoController {

    private final HistoricoService service;

    public HistoricoController(HistoricoService service) {
        this.service = service;
    }

    @GetMapping("/historicos")
    public ResponseEntity findAll(Pageable pageable) {
        List<HistoricoGridDTO> historicoGridDTOS = service.findAll();
        return ResponseEntity.ok(historicoGridDTOS);
    }

    @GetMapping("/historicos/registro")
    public ResponseEntity findRegistroById(Long id) {
        List<HistoricoGridDTO> historicoGridDTOS = service.findRegistroById(id);
        return ResponseEntity.ok(historicoGridDTOS);
    }

    @GetMapping("/historicos/detalhe")
    public ResponseEntity findById(Long id) {
        HistoricoGridDTO historicoGridDTO = service.findById(id);
        return ResponseEntity.ok(historicoGridDTO);
    }

}
