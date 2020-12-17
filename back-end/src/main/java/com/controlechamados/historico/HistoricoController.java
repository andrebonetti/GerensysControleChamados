package com.controlechamados.historico;

import com.controlechamados.fila.FilaService;
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
public class HistoricoController {

    private final HistoricoService service;

    public HistoricoController(HistoricoService service) {
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

}
