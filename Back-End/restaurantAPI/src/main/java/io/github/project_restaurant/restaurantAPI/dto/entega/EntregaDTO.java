package io.github.project_restaurant.restaurantAPI.dto.entega;

import lombok.Data;

@Data
public class EntregaDTO extends EntregaCreateDTO {
    private Integer idEntrega;
    private Integer idPedido;

}
