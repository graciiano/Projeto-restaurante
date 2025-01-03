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
public class ItemPedido {
    private Integer idItemPedido;
    private Integer quantidade;
    private Double valorTotal;
    private ItemMenu itemMenu;
}
