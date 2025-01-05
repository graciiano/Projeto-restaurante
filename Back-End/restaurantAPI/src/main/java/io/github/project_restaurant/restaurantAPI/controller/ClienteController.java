package io.github.project_restaurant.restaurantAPI.controller;


import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteDTO;
import io.github.project_restaurant.restaurantAPI.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
@Validated
@Slf4j
public class ClienteController {

    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> list() {
        return new ResponseEntity<>(clienteService.list(), HttpStatus.OK);
    }
}
