package br.com.DevliveryExpress.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Entrega {
    private Integer idEntrega;
    private Integer idPedido;
    private Integer idEntregador;
    private Integer idMenu;
    private LocalDate dataEntrega;
    private Integer quantidade;
    private StatusEntrega statusEntrega;
}
