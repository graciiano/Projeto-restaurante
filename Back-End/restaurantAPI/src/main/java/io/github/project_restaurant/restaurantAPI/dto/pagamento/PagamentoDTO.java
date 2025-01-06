package io.github.project_restaurant.restaurantAPI.dto.pagamento;

import lombok.Data;

@Data
public class PagamentoDTO extends PagamentoCreateDTO {
    private Integer idPagamento;
    private Integer idPedido;

}
