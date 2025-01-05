package io.github.project_restaurant.restaurantAPI.entity.Enum;

public enum Disponibilidade {
    DISPONIVEL(0),
    INDISPONIVEL(1);

    private Integer tipo;

    Disponibilidade(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static Disponibilidade ofTipo(String tipo) {
        try {
            return Disponibilidade.valueOf(tipo.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tipo inválido: " + tipo);
        }
    }
}
