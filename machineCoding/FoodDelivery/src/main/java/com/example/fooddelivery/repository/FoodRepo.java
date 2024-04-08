package com.example.fooddelivery.repository;

import com.example.fooddelivery.model.Food;

import java.util.HashMap;

public class FoodRepo {

    HashMap<Integer, Food> foods=new HashMap<>();

    public void addFood(Food food)
    {
        foods.put(food.getFood_id(),food);
    }

    public Food getFood(int food_id)
    {
        return foods.get(food_id);
    }
}
