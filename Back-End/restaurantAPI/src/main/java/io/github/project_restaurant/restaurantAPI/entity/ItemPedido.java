package io.github.project_restaurant.restaurantAPI.entity;
import jakarta.persistence.*;
import lombok.*;

@Table(name =  "ITENS_PEDIDO")
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
    @Column(name = "ID_PEDIDO")
    private Integer idPedido;
    @Column(name = "ID_ITEM_MENU")
    private Integer idItemMenu;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name = "PRECO_TOTAL")
    private double precoTotal;

}
