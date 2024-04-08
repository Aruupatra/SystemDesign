package com.example.fooddelivery.repository;

import com.example.fooddelivery.model.Order;

import java.util.HashMap;

public class OrderRepo {

    HashMap<Integer, Order> orders=new HashMap();

    public void addOrder(Order order)
    {
        orders.put(order.getOrder_id(),order);
    }

    public Order getOrder(int order_id)
    {
        return orders.get(order_id);
    }
}
