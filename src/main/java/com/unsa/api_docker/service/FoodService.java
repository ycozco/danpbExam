package com.unsa.api_docker.service;

import com.unsa.api_docker.model.Food;
import com.unsa.api_docker.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getFoodById(Long id) {
        return foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Food not found"));
    }

    public List<Food> getFoodsByCategoria(String categoria) {
        return foodRepository.findByCategoria(categoria);
    }

    public Food createFood(Food food) {
        return foodRepository.save(food);
    }
}
