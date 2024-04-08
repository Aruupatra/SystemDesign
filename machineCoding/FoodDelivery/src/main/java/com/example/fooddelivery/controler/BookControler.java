package com.example.fooddelivery.controler;

import com.example.fooddelivery.model.ResturantFoodQuantity;
import com.example.fooddelivery.model.Location;
import com.example.fooddelivery.model.User;
import com.example.fooddelivery.service.BookService;

import java.util.List;

public class BookControler {

    BookService bookService;
    public void addUser(User user)
    {
        bookService.addUser(user.getUser_id(),user);
    }

    public void nearByResturants(int user_id, Location location)
    {
         bookService.getNearByResturants(user_id,location);
    }

    public int calculator( List<ResturantFoodQuantity> ResturantFoodQuantities)
    {

      return bookService.OrderItem(ResturantFoodQuantities);
    }

}
