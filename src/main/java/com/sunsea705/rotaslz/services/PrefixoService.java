package com.sunsea705.rotaslz.services;

import com.sunsea705.rotaslz.entities.Prefixo;
import com.sunsea705.rotaslz.repositories.PrefixoJpaRepository;
import com.sunsea705.rotaslz.requests.SalvarPrefixoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrefixoService {

    private final PrefixoJpaRepository prefixoJpaRepository;

    public Prefixo salvar(SalvarPrefixoRequest salvarPrefixoRequest) {
        if (salvarPrefixoRequest.prefixoId() == null) {
            return prefixoJpaRepository.save(
                Prefixo
                .builder()
                .sigla(salvarPrefixoRequest.sigla())
                .descricao(salvarPrefixoRequest.descricao())
                .build()
            );
        }
        else {
            return prefixoJpaRepository.findById(salvarPrefixoRequest.prefixoId())
                .map( prefixo -> prefixoJpaRepository.save(
                     Prefixo
                     .builder()
                     .prefixoId(salvarPrefixoRequest.prefixoId())
                     .sigla(salvarPrefixoRequest.sigla())
                     .descricao(salvarPrefixoRequest.descricao())
                     .build()))
                .orElseThrow( () -> new RuntimeException("Prefixo de ID " + salvarPrefixoRequest.prefixoId() + " não encontrado!"));
        }
    }

}
