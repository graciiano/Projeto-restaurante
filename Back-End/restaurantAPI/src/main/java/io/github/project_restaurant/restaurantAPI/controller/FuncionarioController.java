package io.github.project_restaurant.restaurantAPI.controller;


import io.github.project_restaurant.restaurantAPI.dto.funcionario.FuncionarioDTO;
import io.github.project_restaurant.restaurantAPI.service.FuncionarioService;
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
@RequestMapping("/funcionarios")
@Validated
@Slf4j
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<FuncionarioDTO>> list() {
        return new ResponseEntity<>(funcionarioService.list(), HttpStatus.OK);
    }
}
