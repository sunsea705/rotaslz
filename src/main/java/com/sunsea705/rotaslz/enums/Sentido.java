package com.sunsea705.rotaslz.enums;

import lombok.Getter;

@Getter
public enum Sentido {

    BAIRRO("Bairro"),
    CENTRO("Centro");

    private final String descricao;

    Sentido(String descricao) {
        this.descricao = descricao;
    }

}
