package io.github.project_restaurant.restaurantAPI.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Table(name = "ITENS_MENU")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ItemMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item_menu")
    @SequenceGenerator(name = "seq_item_menu", sequenceName = "seq_item_menu", allocationSize = 1)
    @Column(name = "ID_ITEM_MENU")
    private Integer idItemMenu;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "DESCRICAO", nullable = false, length = 255)
    private String descricao;

    @Column(name = "PRECO", nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;
}
