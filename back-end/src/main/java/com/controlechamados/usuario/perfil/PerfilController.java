package com.controlechamados.usuario.perfil;

import com.controlechamados.usuario.perfil.dto.PerfilFormAtualizacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilFormCriacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;
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
public class PerfilController {

    private final PerfilService service;

    public PerfilController(PerfilService service) {
        this.service = service;
    }

    @GetMapping("/perfis")
    public ResponseEntity findAll(Pageable pageable) {
        List<PerfilGridDTO> perfilGridDTOS = service.findAll();

        return ResponseEntity.ok(perfilGridDTOS);
    }

    @GetMapping("/perfis/detalhe")
    public ResponseEntity findById(String id) {
        PerfilGridDTO perfilGridDTO = service.findById( id );
        return ResponseEntity.ok(perfilGridDTO);
    }

    @PostMapping("/perfis/criar")
    public ResponseEntity criar(@RequestBody @Valid PerfilFormCriacaoDTO form) {
        service.criar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/perfis/atualizar")
    public ResponseEntity atualizar(@RequestBody @Valid PerfilFormAtualizacaoDTO form) {
        service.atualizar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/perfis/inativar")
    public ResponseEntity inativar(String id) {
        service.inativar( UUID.fromString ( id ) );
        return ResponseEntity.noContent().build();
    }

}
