package io.github.project_restaurant.restaurantAPI.dto.Itens;


import lombok.Data;

@Data
public class ItemPedidoDTO extends ItemPedidoCreateDTO{

    private Integer idPedido;
    private Integer idItemPedido;
    private Integer idItemMenu;
}
