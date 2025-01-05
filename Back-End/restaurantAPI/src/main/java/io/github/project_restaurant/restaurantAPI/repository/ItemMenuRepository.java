package io.github.project_restaurant.restaurantAPI.repository;

import io.github.project_restaurant.restaurantAPI.entity.ItemMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemMenuRepository extends JpaRepository<ItemMenu, Integer> {
}
