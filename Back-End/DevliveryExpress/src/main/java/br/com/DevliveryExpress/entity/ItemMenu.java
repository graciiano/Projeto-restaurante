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
public class ItemMenu {
    private Integer idItemMenu;
    private String nome;
    private String descricao;
    private Double preco;
}
