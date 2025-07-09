package com.sunsea705.rotaslz.requests;

public record SalvarPrefixoRequest(
    Long prefixoId,
    String sigla,
    String descricao
) {}
