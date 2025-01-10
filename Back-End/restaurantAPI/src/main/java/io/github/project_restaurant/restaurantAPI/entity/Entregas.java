package io.github.project_restaurant.restaurantAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.project_restaurant.restaurantAPI.entity.Enum.StatusEntrega;
import javax.persistence.*;
import lombok.*;

@Table(name = "ENTREGAS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Entregas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_entrega")
    @SequenceGenerator(name = "seq_entrega", sequenceName = "seq_entrega", allocationSize = 1)
    @Column(name = "ID_ENTREGA")
    private Integer idEntrega;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name =  "PRECO_UNITARIO")
    private double precoUnitario;
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_ENTREGA")
    private StatusEntrega statusEntrega;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedidos pedido;
}
