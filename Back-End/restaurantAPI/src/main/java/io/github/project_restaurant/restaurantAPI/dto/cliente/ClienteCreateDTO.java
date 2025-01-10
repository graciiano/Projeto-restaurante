package io.github.project_restaurant.restaurantAPI.dto.cliente;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@JsonPropertyOrder({"idCliente", "nome", "endereco", "contato"})

public class ClienteCreateDTO {

    @NotEmpty
    private String nome;
    @NotEmpty
    private String contato;
    @NotEmpty
    private String endereco;
}
