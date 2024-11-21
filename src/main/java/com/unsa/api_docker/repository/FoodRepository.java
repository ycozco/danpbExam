package com.unsa.api_docker.repository;

import com.unsa.api_docker.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByCategoria(String categoria);
}
