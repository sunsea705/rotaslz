package com.sunsea705.rotaslz.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "linha")
public class Linha {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long linhaId;

    @NotNull
    private Integer numero;

    @NotEmpty
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "prefixo_id")
    private Prefixo prefixo;

    @ManyToOne
    @JoinColumn(name = "localidade_final_id")
    private Localidade pontoFinal;

    @OneToMany(mappedBy = "linha", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LinhaLocalidade> linhaLocalidades;

}
