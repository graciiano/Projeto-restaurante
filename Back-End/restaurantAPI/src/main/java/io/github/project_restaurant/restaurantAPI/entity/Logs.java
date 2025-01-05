package io.github.project_restaurant.restaurantAPI.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "LOGS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Logs {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_log")
    @SequenceGenerator(name = "seq_log", sequenceName = "seq_log", allocationSize = 1)
    @Column(name = "ID_LOG")
    private Integer idLog;
    @Column(name = "TABELA")
    private String tabela;
    @Column(name = "ACAO")
    private String acao;
    @Column(name = "DATA_HORA")
    private LocalDateTime dataHora;
}
