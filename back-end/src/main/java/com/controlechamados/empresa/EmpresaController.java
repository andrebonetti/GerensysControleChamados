package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaCompleteGridDTO;
import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("empresas")
public class EmpresaController {

    private final EmpresaService service;

    public EmpresaController(EmpresaService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity findAll(Pageable pageable) {
        List<EmpresaCompleteGridDTO> empresaCompleteGridDTOS = service.findAll();
        return ResponseEntity.ok(empresaCompleteGridDTOS);
    }

    @GetMapping("/detalhe")
    public ResponseEntity findById(String id) {
        EmpresaCompleteGridDTO empresaCompleteGridDTO = service.findById( id );
        return ResponseEntity.ok(empresaCompleteGridDTO);
    }

    @PostMapping("/criar")
    public ResponseEntity criar(@RequestBody @Valid EmpresaFormCriacaoDTO form) {
        service.criar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/atualizar")
    public ResponseEntity atualizar(@RequestBody @Valid EmpresaFormAtualizacaoDTO form) {
        service.atualizar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/inativar")
    public ResponseEntity inativar(String id) {
        service.inativar( UUID.fromString ( id ) );
        return ResponseEntity.noContent().build();
    }

}
