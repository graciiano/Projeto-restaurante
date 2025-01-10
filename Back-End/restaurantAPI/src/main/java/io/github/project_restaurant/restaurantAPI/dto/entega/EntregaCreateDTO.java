package io.github.project_restaurant.restaurantAPI.dto.entega;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EntregaCreateDTO {

    @NotNull
    private Integer quantidade;
    @NotNull
    private double precoUnitario;
    private String statusEntrega;
}
