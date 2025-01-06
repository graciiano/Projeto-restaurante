package io.github.project_restaurant.restaurantAPI.repository;

import io.github.project_restaurant.restaurantAPI.entity.Entregas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entregas, Integer> {
}
