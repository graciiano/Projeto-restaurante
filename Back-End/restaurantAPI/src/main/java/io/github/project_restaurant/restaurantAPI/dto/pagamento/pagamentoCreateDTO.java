package io.github.project_restaurant.restaurantAPI.dto.pagamento;


import io.github.project_restaurant.restaurantAPI.entity.Enum.FormaPagamento;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class pagamentoCreateDTO {

    private FormaPagamento formaPagamento;
    @NotNull
    private double valorPago;
}
