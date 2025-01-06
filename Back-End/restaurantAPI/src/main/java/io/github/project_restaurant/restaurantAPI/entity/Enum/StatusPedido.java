package io.github.project_restaurant.restaurantAPI.entity.Enum;

import java.util.Arrays;

public enum StatusPedido {
    PENDENTE(0),
    PROCESSANDO(1),
    FINALIZADO(2),
    CANCELADO(3),
    EM_ANDAMENTO(4);

    private Integer tipo;

    StatusPedido(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static StatusPedido getTipo(Integer tipo){
        return Arrays.stream(StatusPedido.values())
                .filter(tp -> tp.getTipo().equals(tipo))
                .findFirst()
                .get();
    }
}
