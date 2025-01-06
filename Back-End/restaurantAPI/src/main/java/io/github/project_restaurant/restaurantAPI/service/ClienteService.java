package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.cliente.ClienteDTO;
import io.github.project_restaurant.restaurantAPI.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ObjectMapper objectMapper;

        public List<ClienteDTO> list() {
        List<ClienteDTO> clienteDTOList = clienteRepository.findAll()
                .stream()
                .map(cliente -> objectMapper.convertValue(cliente, ClienteDTO.class))
                .collect(Collectors.toList());
        return clienteDTOList;
    }
}