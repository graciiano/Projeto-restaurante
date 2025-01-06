package io.github.project_restaurant.restaurantAPI.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.Itens.ItemMenuDTO;
import io.github.project_restaurant.restaurantAPI.repository.ItemMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemMenuService {

    private final ItemMenuRepository itemMenuRepository;
    private final ObjectMapper objectMapper;

    public List<ItemMenuDTO> list() {
        return itemMenuRepository.findAll().stream()
                .map(itemMenu -> objectMapper.convertValue(itemMenu, ItemMenuDTO.class))
                .toList();
    }
}
