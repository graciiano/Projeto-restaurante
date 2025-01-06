package io.github.project_restaurant.restaurantAPI.controller;


import io.github.project_restaurant.restaurantAPI.dto.pedido.PedidoDTO;
import io.github.project_restaurant.restaurantAPI.service.PedidoService;
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
@RequestMapping("/pedidos")
@Validated
@Slf4j
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<PedidoDTO>> list() {
        return new ResponseEntity<>(pedidoService.list(), HttpStatus.OK);
    }
}
