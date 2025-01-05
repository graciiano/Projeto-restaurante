package io.github.project_restaurant.restaurantAPI.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LogsDTO {

    private Integer idLog;
    private String tabela;
    private String acao;
    private LocalDateTime dataHora;
}
