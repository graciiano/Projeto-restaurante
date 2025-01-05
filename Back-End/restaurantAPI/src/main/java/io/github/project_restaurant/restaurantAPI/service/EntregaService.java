package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.entega.EntregaDTO;
import io.github.project_restaurant.restaurantAPI.repository.EntregaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EntregaService {

    private EntregaRepository entregaRepository;
    private ObjectMapper objectMapper;

    public List<EntregaDTO> list() {
        List<EntregaDTO> entregaDTOList = entregaRepository.findAll()
                .stream()
                .map(entrega -> {
                    EntregaDTO entregaDTO = objectMapper.convertValue(entrega, EntregaDTO.class);
                    if(entrega.getPedido() != null) {
                        entregaDTO.setIdPedido(entrega.getPessoa().getIdPessoa);
                    }
                    return entregaDTO;
        }).toList();
        return entregaDTOList;
    }
}
