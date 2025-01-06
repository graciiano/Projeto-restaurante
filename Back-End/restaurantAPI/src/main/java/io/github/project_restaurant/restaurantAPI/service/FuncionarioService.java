package io.github.project_restaurant.restaurantAPI.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.funcionario.FuncionarioDTO;
import io.github.project_restaurant.restaurantAPI.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;
    private final ObjectMapper objectMapper;

    public List<FuncionarioDTO> list() {
        return funcionarioRepository.findAll().stream()
                .map(func -> objectMapper.convertValue(func, FuncionarioDTO.class))
                .toList();
    }
}
