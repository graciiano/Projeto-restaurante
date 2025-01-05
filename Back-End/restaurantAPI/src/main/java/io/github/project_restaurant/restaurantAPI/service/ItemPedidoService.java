package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.Itens.ItemPedidoDTO;
import io.github.project_restaurant.restaurantAPI.repository.ItemPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemPedidoService {

    private ItemPedidoRepository itemPedidoRepository;
    private ObjectMapper objectMapper;

    public List<ItemPedidoDTO> list() {
        return itemPedidoRepository.findAll().stream()
                .map(itemPedido -> objectMapper.convertValue(itemPedido, ItemPedidoDTO.class))
                .toList();
    }
}
