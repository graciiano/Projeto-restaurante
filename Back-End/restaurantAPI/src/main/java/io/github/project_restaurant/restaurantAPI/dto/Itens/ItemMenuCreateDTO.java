package io.github.project_restaurant.restaurantAPI.dto.Itens;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ItemMenuCreateDTO {

    @NotEmpty
    private String nome;
    @NotEmpty
    private String descricao;
    @NotNull
    private double preco;
}
