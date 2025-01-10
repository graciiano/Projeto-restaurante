package io.github.project_restaurant.restaurantAPI.dto.restaurante;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class RestauranteCreateDTO {

    @NotEmpty
    private String nome;
    @NotEmpty
    private String endereco;
    @NotEmpty
    private String contato;
    @NotNull
    private LocalDateTime horaAbertura;
    @NotNull
    private LocalDateTime horaFechamento;

}
