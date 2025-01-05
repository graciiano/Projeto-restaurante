package io.github.project_restaurant.restaurantAPI.dto.cliente;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ClienteDTO extends ClienteCreateDTO{

    private Integer idCliente;

}
