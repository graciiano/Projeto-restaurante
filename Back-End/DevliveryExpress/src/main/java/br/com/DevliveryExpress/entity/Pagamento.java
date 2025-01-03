package br.com.DevliveryExpress.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pagamento  {
    private Integer idPagamento;
    private Integer idPedido;
    private Double valorTotal;
    private TipoPagamento tipoPagamento;
}
