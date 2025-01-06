package io.github.project_restaurant.restaurantAPI.repository;

import io.github.project_restaurant.restaurantAPI.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
