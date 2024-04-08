package com.example.fooddelivery.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {

    private int user_id;
    private String name;
    private Location location;
    private List<Order> history;
    private UserCategory userCategory;
}
