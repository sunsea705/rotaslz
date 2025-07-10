package com.sunsea705.rotaslz.controllers;

import com.sunsea705.rotaslz.entities.Prefixo;
import com.sunsea705.rotaslz.models.Resposta;
import com.sunsea705.rotaslz.requests.SalvarPrefixoRequest;
import com.sunsea705.rotaslz.services.PrefixoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/prefixo")
public class PrefixoController {

    private final PrefixoService prefixoService;

    @PostMapping
    public ResponseEntity<Resposta<Prefixo>> salvar(@RequestBody SalvarPrefixoRequest salvarPrefixoRequest) {
        return ResponseEntity.ok(
                Resposta.<Prefixo>builder()
                    .entidade(prefixoService.salvar(salvarPrefixoRequest))
                    .httpStatus(HttpStatus.OK)
                    .build()
        );
    }
}
