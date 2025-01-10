package io.github.project_restaurant.restaurantAPI.controller;

import io.github.project_restaurant.restaurantAPI.dto.LoginDTO;
import io.github.project_restaurant.restaurantAPI.dto.security.UsuarioCreateDTO;
import io.github.project_restaurant.restaurantAPI.entity.UsuarioEntity;
import io.github.project_restaurant.restaurantAPI.security.TokenService;
import io.github.project_restaurant.restaurantAPI.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    public final AuthenticationManager authenticationManager;
    private final UsuarioService usuarioService;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    @PostMapping
    public String auth(@RequestBody @Valid LoginDTO loginDTO) throws Exception {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(
                        loginDTO.getLogin(),
                        loginDTO.getSenha()
                );

        Authentication authentication =
                authenticationManager.authenticate(
                        usernamePasswordAuthenticationToken);

        UsuarioEntity usuarioValidado = (UsuarioEntity) authentication.getPrincipal();

        return tokenService.generateToken(usuarioValidado);
    }


    @PostMapping("/create")
    public ResponseEntity<UsuarioCreateDTO> create(@RequestBody @Valid UsuarioCreateDTO usuarioCreateDTO) throws Exception {
        UsuarioCreateDTO usuarioCriado = usuarioService.create(usuarioCreateDTO, passwordEncoder, usuarioCreateDTO.getIdCargo());
        return new ResponseEntity<>(usuarioCriado, HttpStatus.CREATED);
    }
}