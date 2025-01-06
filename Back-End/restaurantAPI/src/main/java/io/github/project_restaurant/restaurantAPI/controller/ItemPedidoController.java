package io.github.project_restaurant.restaurantAPI.controller;

import io.github.project_restaurant.restaurantAPI.dto.Itens.ItemPedidoDTO;
import io.github.project_restaurant.restaurantAPI.service.ItemPedidoService;
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
@RequestMapping("/item-pedido")
@Validated
@Slf4j
public class ItemPedidoController {

    private final ItemPedidoService itemPedidoService;

    @GetMapping
    public ResponseEntity<List<ItemPedidoDTO>> list() {
        return new ResponseEntity<>(itemPedidoService.list(), HttpStatus.OK);
    }
}
