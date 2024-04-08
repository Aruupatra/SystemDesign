package com.example.fooddelivery.repository;

import com.example.fooddelivery.model.Location;
import com.example.fooddelivery.model.Resturant;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Locale;

@Getter
@Setter
public class ResturantRepo {

    private HashMap<Integer, Resturant>  resturants=new HashMap<>();

    public void addResturant(Resturant resturant)
    {
        resturants.put(resturant.getResturant_id(),resturant);
    }

    public Resturant getResturant(int resturant_id)
    {
        return resturants.get(resturant_id);
    }




}
