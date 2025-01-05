package io.github.project_restaurant.restaurantAPI.entity;
import io.github.project_restaurant.restaurantAPI.entity.Enum.StatusPedido;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "PEDIDOS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedidos")
    @SequenceGenerator(name = "seq_pedidos", sequenceName = "seq_pedidos", allocationSize = 1)
    @Column(name = "ID_PEDIDOS")
    private Integer idPedido;
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "ID_ENTREGA")
    private Integer idEntrega;
    @Column(name = "DATA_PEDIDO")
    private LocalDateTime dataPedido;
    @Column(name = "STATUS_PEDIDO")
    private StatusPedido statusPedido;
    @Column(name = "ENDERECO_ENTREGA")
    private String enderecoEntrega;
    private double desconto;

}
