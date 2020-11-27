package com.controlechamados.usuario.perfil;

import com.controlechamados.usuario.UsuarioService;
import com.controlechamados.usuario.dto.UsuarioCompleteGridDTO;
import com.controlechamados.usuario.dto.UsuarioFormAtualizacaoDTO;
import com.controlechamados.usuario.dto.UsuarioFormCriacaoDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/usuarios")
    public ResponseEntity findAll(Pageable pageable) {
        List<UsuarioCompleteGridDTO> usuarioCompleteGridDTOS = service.findAll();

        return ResponseEntity.ok(usuarioCompleteGridDTOS);
    }

    @GetMapping("/usuarios/detalhe")
    public ResponseEntity findById(Long id) {
        UsuarioCompleteGridDTO usuarioCompleteGridDTO = service.findById( id );
        return ResponseEntity.ok(usuarioCompleteGridDTO);
    }

    @PostMapping("/usuarios/criar")
    public ResponseEntity criar(@RequestBody @Valid UsuarioFormCriacaoDTO form) {
        service.criar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/usuarios/atualizar")
    public ResponseEntity atualizar(@RequestBody @Valid UsuarioFormAtualizacaoDTO form) {
        service.atualizar( form );
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/usuarios/inativar")
    public ResponseEntity inativar(Long id) {
        service.inativar( id );
        return ResponseEntity.noContent().build();
    }

}
