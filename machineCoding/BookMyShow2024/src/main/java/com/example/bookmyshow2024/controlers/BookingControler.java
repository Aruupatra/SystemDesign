package com.example.bookmyshow2024.controlers;

import com.example.bookmyshow2024.dtos.BookMovieRequestDto;
import com.example.bookmyshow2024.dtos.BookMovieResponseDto;
import com.example.bookmyshow2024.exceptions.ShowNotFoundException;
import com.example.bookmyshow2024.exceptions.UserNotFoundException;
import com.example.bookmyshow2024.models.Booking;

import com.example.bookmyshow2024.services.BookingService;
//import org.hibernate.mapping.List;
import org.springframework.stereotype.Controller;
import java.util.*;

@Controller

public class BookingControler {

    private BookingService bookingService;

     public BookingControler(BookingService bookingService)
     {
       this.bookingService=bookingService;
     }
    public BookMovieResponseDto bookTicket(BookMovieRequestDto bookMovieRequestDto) throws UserNotFoundException, ShowNotFoundException {
       Booking booking = bookingService.bookTicket(bookMovieRequestDto.getUserId(),bookMovieRequestDto.getShowId(),bookMovieRequestDto.getShowSeatIds());

        return null;
    }
}
