package io.github.project_restaurant.restaurantAPI.dto.funcionario;


import io.github.project_restaurant.restaurantAPI.entity.Enum.Disponibilidade;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class FuncionarioCreateDTO {

    @NotEmpty
    private String nome;
    @NotEmpty
    private String contato;
    private Disponibilidade disponibilidade;
}
