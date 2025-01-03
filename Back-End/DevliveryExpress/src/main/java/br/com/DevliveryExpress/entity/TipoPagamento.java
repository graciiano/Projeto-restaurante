package br.com.DevliveryExpress.entity;

import java.util.Arrays;

public enum TipoPagamento {
    DINHEIRO(0),
    CARTAO_CREITO(1),
    CARTAO_DEBITO(2),
    PIX(3);

    private final Integer tipo;

    TipoPagamento(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static TipoPagamento ofTipo(Integer tipo){
        return Arrays.stream(TipoPagamento.values())
                .filter(tp -> tp.getTipo().equals(tipo))
                .findFirst()
                .get();
    }
}
