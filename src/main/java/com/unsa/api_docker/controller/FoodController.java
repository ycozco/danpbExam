package com.unsa.api_docker.controller;

import com.unsa.api_docker.model.Food;
import com.unsa.api_docker.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable Long id) {
        return foodService.getFoodById(id);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Food> getFoodsByCategoria(@PathVariable String categoria) {
        return foodService.getFoodsByCategoria(categoria);
    }

    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return foodService.createFood(food);
    }
}
