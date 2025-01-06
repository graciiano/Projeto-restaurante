package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.Itens.ItemPedidoDTO;
import io.github.project_restaurant.restaurantAPI.entity.ItemPedido;
import io.github.project_restaurant.restaurantAPI.repository.ItemPedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemPedidoService {

    private final ItemPedidoRepository itemPedidoRepository;
    private final ObjectMapper objectMapper;

    public List<ItemPedidoDTO> list() {
        return itemPedidoRepository.findAll().stream()
                .map(itemPedido -> {
                    ItemPedidoDTO itemPedidoDTO = new ItemPedidoDTO();
                    itemPedidoDTO.setIdItemPedido(itemPedido.getIdItemPedido());
                    if (itemPedido.getPedido() != null) {
                        itemPedidoDTO.setIdPedido(itemPedido.getPedido().getIdPedido());
                    }
                    if (itemPedido.getItemMenu() != null) {
                        itemPedidoDTO.setIdItemMenu(itemPedido.getItemMenu().getIdItemMenu());
                    }
                    itemPedidoDTO.setQuantidade(itemPedido.getQuantidade());
                    itemPedidoDTO.setPrecoTotal(itemPedido.getPrecoTotal());
                    return itemPedidoDTO;
                })
                .toList();
    }


}
