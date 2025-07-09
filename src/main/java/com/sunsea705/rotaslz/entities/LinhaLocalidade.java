package com.sunsea705.rotaslz.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "linha_localidade")
public class LinhaLocalidade {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long linhaLocalidadeId;

    @ManyToOne
    @JoinColumn(name = "linha_id")
    private Linha linha;

    @ManyToOne
    @JoinColumn(name = "localidade_id")
    private Localidade localidade;

    @NotNull
    private Integer ordem;

}
