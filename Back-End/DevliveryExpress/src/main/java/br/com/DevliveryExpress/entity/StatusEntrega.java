package br.com.DevliveryExpress.entity;

import java.util.Arrays;

public enum StatusEntrega {
    PENDENTE(0),
    EM_TRANSITO(1),
    ENTREGUE(2),
    CANCELADA(3);

    private final Integer tipo;

    StatusEntrega(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static StatusEntrega ofTipo(Integer tipo){
        return Arrays.stream(StatusEntrega.values())
                .filter(tp -> tp.getTipo().equals(tipo))
                .findFirst()
                .get();
    }
}
