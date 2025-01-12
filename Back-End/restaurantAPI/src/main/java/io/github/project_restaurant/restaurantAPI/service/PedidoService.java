package io.github.project_restaurant.restaurantAPI.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteDTO;
import io.github.project_restaurant.restaurantAPI.dto.pedido.PedidoCreateDTO;
import io.github.project_restaurant.restaurantAPI.dto.pedido.PedidoDTO;
import io.github.project_restaurant.restaurantAPI.entity.Clientes;
import io.github.project_restaurant.restaurantAPI.entity.Pedidos;
import io.github.project_restaurant.restaurantAPI.exception.RegraDeNegocioException;
import io.github.project_restaurant.restaurantAPI.repository.ClienteRepository;
import io.github.project_restaurant.restaurantAPI.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PedidoService {

    private final ClienteRepository clienteRepository;
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

    public PedidoDTO create(PedidoCreateDTO pedidoCreateDTO) {
        Pedidos pedido = objectMapper.convertValue(pedidoCreateDTO, Pedidos.class);

        if (pedidoCreateDTO.getIdCliente() != null) {
            Clientes cliente = clienteRepository.findById(pedidoCreateDTO.getIdCliente())
                    .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado."));
            pedido.setCliente(cliente);
        }

        pedidoRepository.save(pedido);

        PedidoDTO pedidoDTO = new PedidoDTO();
        pedidoDTO.setIdPedido(pedido.getIdPedido());
        pedidoDTO.setIdCliente(pedido.getCliente() != null ? pedido.getCliente().getIdCliente() : null); // Adiciona o idCliente
        pedidoDTO.setDataPedido(pedido.getDataPedido());
        pedidoDTO.setStatusPedido(pedido.getStatusPedido());
        pedidoDTO.setEnderecoEntrega(pedido.getEnderecoEntrega());
        pedidoDTO.setDesconto(pedido.getDesconto());

        return pedidoDTO;
    }

    public PedidoDTO delete(Integer id) throws RegraDeNegocioException {
        Pedidos pedidos = getPedidos(id); // Valida a existência
        clienteRepository.deleteById(pedidos.getIdPedido());
        System.out.println("Pedido deletado com ID: " + pedidos.getIdPedido());
        return objectMapper.convertValue(pedidos, PedidoDTO.class);
    }

    public Pedidos getPedidos(Integer id) throws RegraDeNegocioException{
        return pedidoRepository.findById(id).orElseThrow(
                () -> new RegraDeNegocioException("Pedido com ID: " + id + " Não encontrado")
        );
    }


}
