package com.controlefinanceiro.chamado;

import com.controlefinanceiro.chamado.dto.ChamadoDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ChamadoController {

    @GetMapping("/chamados")
    public ResponseEntity findAll(Pageable pageable) {
        ChamadoDTO chamadoDTO = new ChamadoDTO( UUID.randomUUID(),"Teste");
        return ResponseEntity.ok(chamadoDTO);
    }

}
