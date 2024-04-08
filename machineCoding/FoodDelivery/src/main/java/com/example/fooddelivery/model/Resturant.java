package com.example.fooddelivery.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Resturant {

    private int resturant_id;
    private Location location;
    private String name;
    private List<Food> foods;

}
