package io.github.project_restaurant.restaurantAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.project_restaurant.restaurantAPI.entity.Enum.FormaPagamento;
import javax.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PAGAMENTOS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pagamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pagamento")
    @SequenceGenerator(name = "seq_pagamento", sequenceName = "seq_pagamento", allocationSize = 1)
    @Column(name = "ID_PAGAMENTO")
    private Integer idPagamento;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID_PEDIDO", nullable = false)
    private Pedidos pedido;

    @Column(name = "VALOR_PAGO", nullable = false)
    private BigDecimal valorPago;

    @Enumerated(EnumType.STRING)
    @Column(name = "FORMA_PAGAMENTO", nullable = false)
    private FormaPagamento formaPagamento;
}
