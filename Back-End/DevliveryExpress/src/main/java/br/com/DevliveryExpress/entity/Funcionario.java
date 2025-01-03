package br.com.DevliveryExpress.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Funcionario {
    private Integer idFuncionario;
    private Integer nome;
    private Integer contato;
    private StatusFuncionario statusFuncionario;
}
