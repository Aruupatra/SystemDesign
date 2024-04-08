package com.example.bookmyshow2024.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter

@Entity(name="bookings")
public class Booking extends BaseModel{

   private BookingStatus bookingStatus;

   @OneToMany(mappedBy = "booking")
   private List<ShowSeat> showSeats;
   private int amount;

   @OneToMany(mappedBy = "booking")
   private List<Payment> payments;

   @ManyToOne
   private User user;
   private Date bookingTime;



}
