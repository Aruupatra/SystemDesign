package com.example.carbooking.repository;

import com.example.carbooking.module.*;
import com.example.carbooking.module.Trip;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Component
public class RiderRepository {

    HashMap<Integer, List<Trip>> rider_trips=new HashMap<>();
    public static HashMap<Integer,Rider> riders=new HashMap<>();

    public void addRiderTrips(int rider_Id,Trip trip)
    {
        if(rider_trips.containsKey(rider_Id)==false)
        {
            rider_trips.put(rider_Id,new ArrayList<>());
        }
        rider_trips.get(rider_Id).add(trip);
    }

   public static void addRider(Rider rider)
   {
       riders.put(rider.getRider_id(),rider);
   }

    public List<Trip> getRiderHistory(int rider_id)
    {
        return rider_trips.get(rider_id);
    }
}
