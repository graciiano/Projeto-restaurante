package io.github.project_restaurant.restaurantAPI.entity;
import io.github.project_restaurant.restaurantAPI.entity.Enum.FormaPagamento;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "PAGAMENTOS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Pagamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pagamento")
    @SequenceGenerator(name = "seq_pagamento", sequenceName = "seq_pagamento", allocationSize = 1)
    @Column(name = "ID_PAGAMENTO")
    private Integer idPagamento;
    @Column(name = "ID_PEDIDO")
    private Integer idPedido;
    @Column(name = "VALOR_PAGO")
    private double valorPago;
    @Column(name = "FORMA_PAGAMENTO")
    private FormaPagamento formaPagamento;
}
