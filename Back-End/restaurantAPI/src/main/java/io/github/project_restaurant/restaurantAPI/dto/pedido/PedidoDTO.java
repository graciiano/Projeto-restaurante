package io.github.project_restaurant.restaurantAPI.dto.pedido;

import lombok.Data;

@Data
public class PedidoDTO extends PedidoCreateDTO {

    private Integer idPedido;
    private Integer idEntrega;
}
