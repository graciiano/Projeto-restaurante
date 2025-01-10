package io.github.project_restaurant.restaurantAPI.dto.Itens;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
