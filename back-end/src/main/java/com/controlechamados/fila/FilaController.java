package com.controlechamados.fila;

import com.controlechamados.fila.dto.FilaCompleteGridDTO;
import com.controlechamados.fila.dto.FilaFormAtualizacaoDTO;
import com.controlechamados.fila.dto.FilaFormCriacaoDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FilaController {

    private final FilaService service;

    public FilaController(FilaService service) {
        this.service = service;
    }

    @GetMapping("/filas")
    public ResponseEntity findAll(Pageable pageable) {
        List<FilaCompleteGridDTO> filaCompleteGridDTOS = service.findAll();
        return ResponseEntity.ok(filaCompleteGridDTOS);
    }

    @GetMapping("/filas/detalhe")
    public ResponseEntity findById(Long id) {
        FilaCompleteGridDTO filaCompleteGridDTO = service.findById(id);
        return ResponseEntity.ok(filaCompleteGridDTO);
    }

    @PostMapping("/filas/criar")
    public ResponseEntity criar(@RequestBody @Valid FilaFormCriacaoDTO form) {
        service.criar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/filas/atualizar")
    public ResponseEntity atualizar(@RequestBody @Valid FilaFormAtualizacaoDTO form) {
        service.atualizar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/filas/inativar")
    public ResponseEntity inativar(Long id) {
        service.inativar( id );
        return ResponseEntity.noContent().build();
    }

}
