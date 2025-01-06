package io.github.project_restaurant.restaurantAPI.dto.pedido;

import io.github.project_restaurant.restaurantAPI.entity.Enum.StatusPedido;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class PedidoCreateDTO {

    @NotEmpty
    private LocalDateTime dataPedido;
    private StatusPedido statusPedido;
    @NotEmpty
    private String enderecoEntrega;
    private double desconto;


}
