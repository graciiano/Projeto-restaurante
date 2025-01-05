package io.github.project_restaurant.restaurantAPI.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "CLIENTES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
    @SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "NOME")
    private Integer nome;
    @Column(name = "CONTATO")
    private String contato;
    @Column(name =  "ENDERECO")
    private String endereco;
}
