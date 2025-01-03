package br.com.DevliveryExpress.entity;

import java.util.Arrays;

public enum StatusPedido {
    ANALISE(0),
    EM_PREPARACAO(1),
    PRONTO(2),
    ENTREGUE(3),
    CANCELADO(4);

    private final Integer tipo;

    StatusPedido(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static StatusPedido ofTipo(Integer tipo){
        return Arrays.stream(StatusPedido.values())
                .filter(tp -> tp.getTipo().equals(tipo))
                .findFirst()
                .get();
    }

}
