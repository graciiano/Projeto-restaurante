package io.github.project_restaurant.restaurantAPI.entity.Enum;

public enum StatusPedido {
    PENDENTE(0),
    PROCESSANDO(1),
    FINALIZADO(2),
    CANCELADO(3);

    private Integer tipo;

    StatusPedido(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public static StatusPedido ofTipo(String tipo) {
        try {
            return StatusPedido.valueOf(tipo.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Status do pedido inválido: " + tipo);
        }
    }
}
