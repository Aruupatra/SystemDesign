package com.example.carbooking.services;

import com.example.carbooking.module.*;
import com.example.carbooking.repository.CabRepository;
import com.example.carbooking.repository.RiderRepository;
import com.example.carbooking.repository.TripRepository;
import com.example.carbooking.strategies.CabBookStrategies;
import com.example.carbooking.strategies.PricingStrategies;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.carbooking.repository.CabRepository.*;

@AllArgsConstructor

public class BookServices {

    CabRepository cabRepository;
    CabBookStrategies cabBookStrategies;
    RiderRepository riderRepository;
    TripRepository tripRepository;
    PricingStrategies pricingStrategies;

    public Trip bookCab(int rider_Id, Location locationFrom,Location locationTo)
    {
        List<Cab> selectedCabs=getAllNearByCabs(locationFrom);

        Cab cab=cabBookStrategies.getACab(selectedCabs);
        Trip trip=new Trip();
        trip.setCab_id(cab.getCab_id());
        trip.setRider_id(rider_Id);
        trip.setFrom(locationFrom);
        trip.setTo(locationTo);
        trip.setTripStatus(TripStatus.INPROGRESS);

        cab.setCabStatus(CabStatus.BUSY);

        riderRepository.addRiderTrips(rider_Id,trip);
        tripRepository.addTrip(trip);

        return trip;

    }

    public List<Cab> getAllNearByCabs(Location location)
    {
        List<Cab> nearByCabs=new ArrayList<>();
        for(Cab c: cabRepository.cabs.values())
        {
            if(c.distance(location) <= 10 && c.getCabStatus().equals(CabStatus.AVAILABLE))
            {
                nearByCabs.add(c);
            }
        }
        return nearByCabs;
    }

    public int TourEnd(Trip trip)
    {
     int price=pricingStrategies.getTotal(trip.getFrom(),trip.getTo());
     Cab cab=cabRepository.getCab(trip.getCab_id());
     cab.setCabStatus(CabStatus.AVAILABLE);
     cab.setCurrlocation(trip.getTo());
     trip.setTripStatus(TripStatus.FINISHED);
     return price;
    }
}
