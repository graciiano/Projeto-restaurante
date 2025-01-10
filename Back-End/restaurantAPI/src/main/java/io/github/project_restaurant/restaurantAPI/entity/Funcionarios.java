package io.github.project_restaurant.restaurantAPI.entity;

import io.github.project_restaurant.restaurantAPI.entity.Enum.Disponibilidade;
import javax.persistence.*;
import lombok.*;

@Table(name = "FUNCIONARIOS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Funcionarios {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_funcionario")
    @SequenceGenerator(name = "seq_funcionario", sequenceName = "seq_funcionario", allocationSize = 1)
    @Column(name = "ID_FUNCIONARIO")
    private Integer idFuncionario;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CONTATO")
    private String contato;
    @Enumerated(EnumType.STRING)
    @Column(name = "DISPONIBILIDADE", nullable = false)
    private Disponibilidade disponibilidade;
}
