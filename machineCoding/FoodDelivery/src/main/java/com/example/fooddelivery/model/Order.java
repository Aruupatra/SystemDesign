package com.example.fooddelivery.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Order {

    private int order_id;
    private List<Food> foods;
    private int price;
    private OrderStatus orderStatus;
}
