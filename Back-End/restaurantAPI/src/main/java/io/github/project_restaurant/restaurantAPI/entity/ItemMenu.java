package io.github.project_restaurant.restaurantAPI.entity;
import jakarta.persistence.*;
import lombok.*;

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
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PRECO")
    private double preco;

}
