package io.github.project_restaurant.restaurantAPI.controller;


import io.github.project_restaurant.restaurantAPI.dto.Itens.ItemMenuDTO;
import io.github.project_restaurant.restaurantAPI.service.ItemMenuService;
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
@RequestMapping("/item-menu")
@Validated
@Slf4j
public class ItemMenuController {

    public final ItemMenuService itemMenuService;

    @GetMapping
    public ResponseEntity<List<ItemMenuDTO>> list() {
        return new ResponseEntity<>(itemMenuService.list(), HttpStatus.OK);
    }
}
