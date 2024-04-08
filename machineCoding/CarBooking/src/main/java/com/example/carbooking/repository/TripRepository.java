package com.example.carbooking.repository;

import com.example.carbooking.module.Trip;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class TripRepository {

    Map<Integer, Trip> trips=new HashMap<>();

    public void addTrip(Trip trip)
    {
        trips.put(trip.getTrip_id(),trip);
    }

    public Trip getTrip(int trip_id)
    {
       return trips.get(trip_id);
    }

}
