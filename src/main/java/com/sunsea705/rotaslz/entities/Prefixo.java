package com.sunsea705.rotaslz.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prefixo")
public class Prefixo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prefixoId;

    @Size(max = 1)
    @Column(length = 1)
    private String sigla;

    @NotEmpty
    private String descricao;

}
