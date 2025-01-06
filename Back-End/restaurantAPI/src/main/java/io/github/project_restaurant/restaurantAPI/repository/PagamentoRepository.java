package io.github.project_restaurant.restaurantAPI.repository;

import io.github.project_restaurant.restaurantAPI.entity.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamentos, Integer> {
}
