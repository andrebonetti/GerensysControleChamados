package com.controlechamados.chamado.categoria;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {

    @GetMapping("/chamado/categoria")
    public ResponseEntity findAll(Pageable pageable) {
//        ChamadoDTO chamadoDTO = new ChamadoDTO( UUID.randomUUID(),"Teste");
//        ResponseEntity.ok(chamadoDTO);
        return null;
    }

}
