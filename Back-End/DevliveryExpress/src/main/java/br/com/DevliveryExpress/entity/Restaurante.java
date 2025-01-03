package br.com.DevliveryExpress.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Restaurante {

    private Integer idRestaurante;
    private String nome;
    private String endereco;
    private String contato;
    private LocalDate horaAbertura;
    private LocalDate horaFechamento;
    private List<ItemMenu> menu;
}
