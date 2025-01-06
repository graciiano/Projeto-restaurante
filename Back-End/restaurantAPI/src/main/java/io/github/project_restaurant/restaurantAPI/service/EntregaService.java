package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.entega.EntregaDTO;
import io.github.project_restaurant.restaurantAPI.repository.EntregaRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EntregaService {

    private final EntregaRepository entregaRepository;
    private final ObjectMapper objectMapper;

    public List<EntregaDTO> list() {
        return entregaRepository.findAll().stream()
                .map(entrega -> {
                    EntregaDTO entregaDTO = new EntregaDTO();
                    entregaDTO.setIdEntrega(entrega.getIdEntrega());
                    if (entrega.getPedido() != null) {
                        entregaDTO.setIdPedido(entrega.getPedido().getIdPedido());
                    }
                    entregaDTO.setStatusEntrega(entrega.getStatusEntrega().name());
                    entregaDTO.setQuantidade(entrega.getQuantidade());
                    entregaDTO.setPrecoUnitario(entrega.getPrecoUnitario());
                    return entregaDTO;
                }).toList();
    }


}
