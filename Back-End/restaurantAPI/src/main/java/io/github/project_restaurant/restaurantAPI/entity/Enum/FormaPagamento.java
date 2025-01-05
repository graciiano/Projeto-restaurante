package io.github.project_restaurant.restaurantAPI.entity.Enum;

public enum FormaPagamento {
    CARTAO_CREDITO(0),
    CARTAO_DEBITO(1),
    DINHEIRO(2),
    PIX(3);


    private Integer tipo;

    FormaPagamento(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }
    public static FormaPagamento ofTipo(String tipo) {
        try {
            return FormaPagamento.valueOf(tipo.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Forma de pagamento inválida: " + tipo);
        }
    }
}
