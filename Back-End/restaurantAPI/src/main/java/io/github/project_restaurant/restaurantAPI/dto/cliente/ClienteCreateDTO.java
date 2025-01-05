package io.github.project_restaurant.restaurantAPI.dto.cliente;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ClienteCreateDTO {

    @NotEmpty
    private String nome;
    @NotEmpty
    private String contato;
    @NotEmpty
    private String endereco;
}
