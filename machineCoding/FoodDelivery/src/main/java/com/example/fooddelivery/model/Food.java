package com.example.fooddelivery.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Food {


   private int food_id;
   private String name;
   private FoodType foodType;
   private int FoodPrice;
   private int quantity;
}
