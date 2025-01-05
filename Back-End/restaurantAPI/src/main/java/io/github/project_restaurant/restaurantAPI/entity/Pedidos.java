package io.github.project_restaurant.restaurantAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.project_restaurant.restaurantAPI.entity.Enum.StatusPedido;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

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
    @Column(name = "ID_PEDIDO")
    private Integer idPedido;

    @Column(name = "DATA_PEDIDO", nullable = false)
    private LocalDateTime dataPedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_PEDIDO", nullable = false)
    private StatusPedido statusPedido;

    @Column(name = "ENDERECO_ENTREGA", nullable = false)
    private String enderecoEntrega;

    @Column(name = "DESCONTO")
    private double desconto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", nullable = false)
    private Clientes cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ENTREGA", referencedColumnName = "ID_ENTREGA", nullable = true)
    private Entregas entrega;

    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ItemPedido> itensPedido;
}
