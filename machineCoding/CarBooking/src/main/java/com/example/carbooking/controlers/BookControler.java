package com.example.carbooking.controlers;

import com.example.carbooking.module.Cab;
import com.example.carbooking.module.Location;
import com.example.carbooking.module.Rider;
import com.example.carbooking.module.Trip;
import com.example.carbooking.repository.CabRepository;
import com.example.carbooking.repository.DriverRepository;
import com.example.carbooking.repository.RiderRepository;
import com.example.carbooking.repository.TripRepository;
import com.example.carbooking.services.BookServices;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Setter
@Getter
@Component
public  class BookControler {

    private  BookServices bookServices;
    public BookControler(BookServices bookServices)
    {
        this.bookServices=bookServices;
    }

    public  Trip CanBookaCab(Rider rider,Location locationTo)
    {
        RiderRepository.addRider(rider);
        Trip trip=bookServices.bookCab(rider.getRider_id(),rider.getCurrentLocation(),locationTo);

        return trip;
    }

    public  int EndBook(Trip trip)
    {
        int total=bookServices.TourEnd(trip);
        return total;
    }



}
