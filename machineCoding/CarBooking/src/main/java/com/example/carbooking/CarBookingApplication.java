package com.example.carbooking;

import com.example.carbooking.controlers.BookControler;
import com.example.carbooking.module.*;
import com.example.carbooking.repository.CabRepository;
import com.example.carbooking.repository.DriverRepository;
import com.example.carbooking.repository.RiderRepository;
import com.example.carbooking.repository.TripRepository;
import com.example.carbooking.services.BookServices;
import com.example.carbooking.strategies.CabBookStrategies;
import com.example.carbooking.strategies.DefaultCabBookStrategies;
import com.example.carbooking.strategies.DefaultPricingStrategies;
import com.example.carbooking.strategies.PricingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class CarBookingApplication {

    public static void main(String[] args) {

      //  SpringApplication.run(CarBookingApplication.class, args);
        //BookControler bookControler=new BookControler(new BookServices(new CabRepository(),new ));
        //create a drive
        BookControler bookControler=new BookControler(new BookServices(new CabRepository(),
        new DefaultCabBookStrategies(),
        new RiderRepository(),
        new TripRepository(),
        new DefaultPricingStrategies()));
        DriverRepository.addCab(new Driver(1,"Arun"));
        CabRepository.addCab(new Cab(001,1,new Location(1,1), CabStatus.AVAILABLE));
        Rider rider1=new Rider(1001,"Irfan",new Location(5,0));



        Trip trip=bookControler.CanBookaCab(rider1,new Location(2,5));
        System.out.println(bookControler.EndBook(trip));

        System.out.println(trip.getTripStatus());
    }

}
