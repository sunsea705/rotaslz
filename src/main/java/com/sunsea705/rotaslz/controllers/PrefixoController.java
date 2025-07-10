package com.sunsea705.rotaslz.controllers;

import com.sunsea705.rotaslz.entities.Prefixo;
import com.sunsea705.rotaslz.models.Resposta;
import com.sunsea705.rotaslz.requests.SalvarPrefixoRequest;
import com.sunsea705.rotaslz.services.PrefixoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/prefixo")
@Tag(name = "Prefixo", description = "Operações REST a respeito da entidade Prefixo.")
public class PrefixoController {

    private final PrefixoService prefixoService;

    @PostMapping
    @Operation(
        summary = "Salva/Edita informações de um Prefixo.",
        description = "Passe um ID para editar, não passe ou passe nulo para criar um novo."
    )
    public ResponseEntity<Resposta<Prefixo>> salvar(@RequestBody SalvarPrefixoRequest salvarPrefixoRequest) {
        return ResponseEntity.ok(
                Resposta.<Prefixo>builder()
                    .entidade(prefixoService.salvar(salvarPrefixoRequest))
                    .httpStatus(HttpStatus.OK)
                    .build()
        );
    }
}
