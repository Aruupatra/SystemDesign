package com.example.carbooking.repository;

import com.example.carbooking.module.Cab;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component

public class CabRepository {

    public static HashMap<Integer, Cab> cabs=new HashMap<>();

    public static void addCab(Cab cab)
    {
        cabs.put(cab.getCab_id(),cab);
    }

    public Cab getCab(int cab_id)
    {
        return cabs.get(cab_id);
    }


}
