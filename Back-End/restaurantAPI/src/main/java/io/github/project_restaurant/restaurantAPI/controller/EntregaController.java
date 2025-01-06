package io.github.project_restaurant.restaurantAPI.controller;


import io.github.project_restaurant.restaurantAPI.dto.entega.EntregaDTO;
import io.github.project_restaurant.restaurantAPI.service.EntregaService;
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
@RequestMapping("/entregas")
@Validated
@Slf4j
public class EntregaController {

    private final EntregaService entregaService;

    @GetMapping
    public ResponseEntity<List<EntregaDTO>> list() {
        return new ResponseEntity<>(entregaService.list(), HttpStatus.OK);
    }
}
