package com.sunsea705.rotaslz.entities;

import com.sunsea705.rotaslz.enums.Sentido;
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
@Table(name = "localidade")
public class Localidade {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long localidadeId;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Sentido sentido;

    @NotEmpty
    private String descricao;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tipo_localidade_id")
    private TipoLocalidade tipoLocalidade;

    @OneToMany(mappedBy = "localidade", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LinhaLocalidade> linhaLocalidades;

}
