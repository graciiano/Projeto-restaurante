package io.github.project_restaurant.restaurantAPI.entity;

import java.time.LocalDateTime;

import javax.persistence.*;
import lombok.*;

@Table(name = "RESTAURANTES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Restaurantes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_restaurante")
    @SequenceGenerator(name = "seq_restaurante", sequenceName = "seq_restaurante", allocationSize = 1)
    @Column(name = "ID_RESTAURANTE")
    private Integer idRestaurante;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CONTATO")
    private String contato;
    @Column(name = "HORARIO_ABERTURA")
    private LocalDateTime horarioAbertura;
    @Column(name = "HORARIO_FECHAMENTO")
    private LocalDateTime horarioFechamento;

}
