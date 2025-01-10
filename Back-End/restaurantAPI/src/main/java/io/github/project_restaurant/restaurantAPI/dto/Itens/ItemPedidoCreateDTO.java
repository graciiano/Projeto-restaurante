package io.github.project_restaurant.restaurantAPI.dto.Itens;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ItemPedidoCreateDTO {

    @NotNull
    private Integer quantidade;
    @NotNull
    private double precoTotal;
}
