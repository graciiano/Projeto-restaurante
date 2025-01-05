package io.github.project_restaurant.restaurantAPI.entity.Enum;

import java.util.Arrays;

public enum StatusEntrega {
    PENDENTE(0),
    PROCESSANDO(1),
    DESPACHADO(2),
    EM_TRANSITO(3),
    ENTREGUE(4),
    DEVOLVIDO(5),
    CANCELADO(6),
    ATRASADO(7),
    NAO_ENTREGUE(8);

    private final Integer tipo;

    StatusEntrega(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static StatusEntrega ofTipo(Integer tipo) {
        return Arrays.stream(StatusEntrega.values())
                .filter(status -> status.getTipo().equals(tipo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Tipo inválido: " + tipo));
    }
}
