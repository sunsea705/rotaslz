package com.sunsea705.rotaslz.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/health")
@Tag(name = "Health Check", description = "Verifica se a API está viva e funcionando.")
public class HealthController {

    @GetMapping
    @Operation(
        summary = "Verifica se o sistema está online",
        description = "Endpoint para health check. Retorna uma mensagem confirmando que a API está no ar."
    )
    public ResponseEntity<String> estouViva() {
        return ResponseEntity.ok("A mãe está on!");
    }
}
