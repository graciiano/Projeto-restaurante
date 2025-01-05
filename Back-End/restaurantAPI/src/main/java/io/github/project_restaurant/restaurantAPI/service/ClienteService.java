package io.github.project_restaurant.restaurantAPI.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteDTO;
import io.github.project_restaurant.restaurantAPI.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private ClienteRepository clienteRepository;
    private ObjectMapper objectMapper;

    public List<ClienteDTO> list() {
        return clienteRepository.findAll()
                .stream().map(cliente -> objectMapper.convertValue(cliente, ClienteDTO.class))
                .toList();
    }
}
