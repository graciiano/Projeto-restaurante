package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.restaurante.RestauranteDTO;
import io.github.project_restaurant.restaurantAPI.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RestauranteService {

    private RestauranteRepository restauranteRepository;
    private ObjectMapper objectMapper;

    public List<RestauranteDTO> list() {
        return restauranteRepository.findAll()
                .stream()
                .map(res -> objectMapper.convertValue(res, RestauranteDTO.class))
                .toList();
    }
}
