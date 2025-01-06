package io.github.project_restaurant.restaurantAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Table(name = "ITENS_PEDIDO")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_pedido")
    @SequenceGenerator(name = "seq_item_pedido", sequenceName = "seq_item_pedido", allocationSize = 1)
    @Column(name = "ID_ITEM_PEDIDO")
    private Integer idItemPedido;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID_PEDIDO", nullable = false)
    private Pedidos pedido;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ITEM_MENU", referencedColumnName = "ID_ITEM_MENU", nullable = false)
    private ItemMenu itemMenu;

    @Column(name = "QUANTIDADE", nullable = false)
    private Integer quantidade;

    @Column(name = "PRECO_TOTAL", nullable = false, precision = 10, scale = 2)
    private double precoTotal;

}
