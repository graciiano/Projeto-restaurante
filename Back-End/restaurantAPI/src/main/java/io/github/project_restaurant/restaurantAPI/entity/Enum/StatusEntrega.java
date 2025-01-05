package io.github.project_restaurant.restaurantAPI.entity.Enum;

import java.util.Arrays;

public enum StatusEntrega {
    DISPONIVEL(0),
    INDISPONIVEL(1);


    private Integer tipo;

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
