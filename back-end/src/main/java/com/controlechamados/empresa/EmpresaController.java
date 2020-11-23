package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
public class EmpresaController {

    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @GetMapping("/empresas")
    public ResponseEntity findAll(Pageable pageable) {
        List<EmpresaGridDTO> empresaGridDTOS = service.findAll();
        return ResponseEntity.ok(empresaGridDTOS);
    }

    @GetMapping("/empresas/detalhe")
    public ResponseEntity findById(String id) {
        EmpresaGridDTO empresaGridDTO = service.findById( id );
        return ResponseEntity.ok(empresaGridDTO);
    }

    @PostMapping("/empresas/criar")
    public ResponseEntity criar(@RequestBody @Valid EmpresaFormCriacaoDTO form) {
        service.criar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/empresas/atualizar")
    public ResponseEntity atualizar(@RequestBody @Valid EmpresaFormAtualizacaoDTO form) {
        service.atualizar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/empresas/inativar")
    public ResponseEntity inativar(String id) {
        service.inativar( UUID.fromString( id ) );
        return ResponseEntity.noContent().build();
    }

}
