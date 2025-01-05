package io.github.project_restaurant.restaurantAPI.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.project_restaurant.restaurantAPI.dto.LogsDTO;
import io.github.project_restaurant.restaurantAPI.repository.LogsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LogsService {

    private LogsRepository logsRepository;
    private ObjectMapper objectMapper;

    public List<LogsDTO> list() {
        return logsRepository.findAll()
                .stream()
                .map(log -> objectMapper.convertValue(log, LogsDTO.class))
                .toList();
    }
}
