package com.example.fooddelivery.service;

import com.example.fooddelivery.model.*;
import com.example.fooddelivery.repository.*;
import com.example.fooddelivery.repository.UserRepo;
import com.example.fooddelivery.strategies.PriceCalculationStrategies;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    final int MAX_DISTANCE_ALLOWED=10;
    UserRepo userRepo;
    ResturantRepo resturantRepo;
    PriceCalculationStrategies priceCalculationStrategies;

    public void addUser(int id, User user)
    {
        userRepo.addUser(user);
    }

    public void getNearByResturants(int user_id,Location location)
    {

        List<Resturant> selectedResturant=AllNearByResturant(location);

        for(Resturant resturant:selectedResturant)
        {
            System.out.println(resturant.getName());
            for(Food food:resturant.getFoods())
            {
                System.out.println(food.getFoodType()+"Food Name "+food.getName()+" Price "+food.getFoodPrice()+" QuantityAvailable "+food.getQuantity());
            }
        }

    }

    public List<Resturant> AllNearByResturant(Location location)
    {
        List<Resturant> nearResturants=new ArrayList<>();
        for(Resturant resturant:resturantRepo.getResturants().values())
        {
            if(CalculateDistance(location,resturant.getLocation())<=MAX_DISTANCE_ALLOWED)
            {
                nearResturants.add(resturant);
            }
        }
        return nearResturants;
    }

    public int CalculateDistance(Location l1,Location l2)
    {
         return (l1.getX()-l2.getX()) +(l1.getY()-l2.getY());
    }

    public int OrderItem(List<ResturantFoodQuantity> resturantFoodQuantities)
    {

        int basePrice=CalculateBasePrice(resturantFoodQuantities);
        return priceCalculationStrategies.CalculatePrice(basePrice);

    }

    public int CalculateBasePrice(List<ResturantFoodQuantity> ListOfresturantFoodQuantities)
    {
        int price=0;

        for(ResturantFoodQuantity resturantFoodQuantities :ListOfresturantFoodQuantities)
        {
            for(Resturant resturant:resturantRepo.getResturants().values())
            {
                if(resturantFoodQuantities.getResturant().equals(resturant.getName()))
                {
                    for(Food food:resturant.getFoods())
                    {
                        if(food.getName().equals(resturantFoodQuantities.getFood()))
                        {
                            price=price+food.getFoodPrice()*resturantFoodQuantities.getQuantity();
                            food.setQuantity(food.getQuantity()- resturantFoodQuantities.getQuantity());
                        }
                    }
                }
            }

        }
        return price;
    }
}
