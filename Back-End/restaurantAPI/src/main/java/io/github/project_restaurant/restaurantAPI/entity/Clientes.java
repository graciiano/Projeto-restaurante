package io.github.project_restaurant.restaurantAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    private String nome;

    @Column(name = "CONTATO")
    private String contato;

    @Column(name = "ENDERECO")
    private String endereco;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Pedidos> pedidos;
    }

