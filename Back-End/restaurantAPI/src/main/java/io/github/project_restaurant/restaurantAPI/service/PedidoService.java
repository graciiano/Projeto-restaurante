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

    private final PedidoRepository pedidoRepository;
    private final ObjectMapper objectMapper;

    public List<PedidoDTO> list() {
        return pedidoRepository.findAll()
                .stream()
                .map(pedido -> {
                    PedidoDTO pedidoDTO = new PedidoDTO();
                    pedidoDTO.setIdPedido(pedido.getIdPedido());
                    pedidoDTO.setDataPedido(pedido.getDataPedido());
                    pedidoDTO.setStatusPedido(pedido.getStatusPedido());
                    pedidoDTO.setEnderecoEntrega(pedido.getEnderecoEntrega());
                    if (pedido.getEntrega() != null) {
                        pedidoDTO.setIdEntrega(pedido.getEntrega().getIdEntrega());
                    }
                    pedidoDTO.setDesconto(pedido.getDesconto());

                    if (pedido.getCliente() != null) {
                        pedidoDTO.setIdCliente(pedido.getCliente().getIdCliente());
                    }

                    return pedidoDTO;
                })
                .toList();
    }

}
