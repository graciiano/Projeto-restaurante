package io.github.project_restaurant.restaurantAPI.dto.security;


import lombok.Data;

@Data
public class UsuarioCreateDTO {

    private String login;
    private String senha;
    private Integer idCargo;
}
