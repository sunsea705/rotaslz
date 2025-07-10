package com.sunsea705.rotaslz.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * Classe de retorno simples para respostas de endpoint.
 * Encapsula algumas coisas legais...
 * @param <T>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resposta<T> {

    private T entidade;
    private HttpStatus httpStatus;
    private String mensagemDesenvolvedor;

}
