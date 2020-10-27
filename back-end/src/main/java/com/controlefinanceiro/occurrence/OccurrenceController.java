package com.controlefinanceiro.occurrence;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccurrenceController {

    @GetMapping("/users")
    public ResponseEntity findAll(Pageable pageable) {
        return ResponseEntity.ok("Restaa");
    }

}
