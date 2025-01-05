package io.github.project_restaurant.restaurantAPI.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.pedido.PedidoDTO;
import io.github.project_restaurant.restaurantAPI.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;
    private ObjectMapper objectMapper;

    public List<PedidoDTO> list() {
        return pedidoRepository.findAll()
                .stream()
                .map(pedido -> objectMapper.convertValue(pedido, PedidoDTO.class))
                .toList();
    }
}
