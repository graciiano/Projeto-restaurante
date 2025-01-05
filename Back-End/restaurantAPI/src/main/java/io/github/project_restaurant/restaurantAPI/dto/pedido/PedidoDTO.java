package io.github.project_restaurant.restaurantAPI.dto.pedido;

import lombok.Data;

@Data
public class PedidoDTO {

    private Integer idPedido;
    private Integer idCliente;
    private Integer idEntrega;
}
