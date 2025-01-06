package io.github.project_restaurant.restaurantAPI.dto.funcionario;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class FuncionarioDTO extends FuncionarioCreateDTO {
    private Integer idFuncionario;
}
