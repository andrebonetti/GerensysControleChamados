package com.controlechamados.chamado;

import com.controlechamados.chamado.dto.ChamadoFormDTO;
import com.controlechamados.chamado.dto.ChamadoGridDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ChamadoController {

    private final ChamadoService service;

    public ChamadoController(ChamadoService service) {
        this.service = service;
    }

    @GetMapping("/chamados")
    public ResponseEntity findAll(Pageable pageable) {
        List<ChamadoGridDTO> chamadoGridDTOS = service.findAll();
        return ResponseEntity.ok(chamadoGridDTOS);
    }

    @GetMapping("/chamados/detalhe")
    public ResponseEntity findById(String id) {
        ChamadoGridDTO chamadoGridDTO = service.findById( id );
        return ResponseEntity.ok(chamadoGridDTO);
    }

    @PostMapping("/chamados/alterarFila")
    public ResponseEntity criarChamado(@RequestBody @Valid ChamadoFormDTO form) {
        service.criarChamado( form );
        return ResponseEntity.noContent().build();
    }

}
