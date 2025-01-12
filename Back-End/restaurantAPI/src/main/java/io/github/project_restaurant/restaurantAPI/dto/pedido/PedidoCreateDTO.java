package io.github.project_restaurant.restaurantAPI.dto.pedido;

import io.github.project_restaurant.restaurantAPI.entity.Enum.StatusPedido;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
public class PedidoCreateDTO {
    private Integer idCliente;
    @NotNull
    private LocalDateTime dataPedido;
    private StatusPedido statusPedido;
    @NotNull
    private String enderecoEntrega;
    private double desconto;
}