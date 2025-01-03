package br.com.DevliveryExpress.entity;

import java.util.Arrays;

public enum StatusFuncionario {
    DISPONIVEL(1),
    INDISPONIVEL(2);

    private final Integer tipo;

    StatusFuncionario(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static StatusFuncionario ofTipo(Integer tipo){
        return Arrays.stream(StatusFuncionario.values())
                .filter(tp -> tp.getTipo().equals(tipo))
                .findFirst()
                .get();
    }

}
