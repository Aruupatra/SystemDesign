package com.example.bookmyshow2024.services;

import com.example.bookmyshow2024.exceptions.ShowNotFoundException;
import com.example.bookmyshow2024.exceptions.UserNotFoundException;
import com.example.bookmyshow2024.models.Booking;
import com.example.bookmyshow2024.models.Show;
import com.example.bookmyshow2024.models.ShowSeat;
import com.example.bookmyshow2024.models.User;
import com.example.bookmyshow2024.repositories.ShowRepository;
import com.example.bookmyshow2024.repositories.ShowSeatRepository;
import com.example.bookmyshow2024.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BookingService {

    UserRepository userRepository;
    ShowRepository showRepository;
    ShowSeatRepository showSeatRepository;
    public BookingService(UserRepository userRepository,ShowRepository showRepository,ShowSeatRepository showSeatRepository)
    {
        this.userRepository=userRepository;
        this.showRepository=showRepository;
        this.showSeatRepository=showSeatRepository;
    }
    public Booking bookTicket(long userId, long showId, java.util.List<Long> showSeatIds) throws UserNotFoundException, ShowNotFoundException {

        Optional<User> optionalUser= userRepository.findById(userId);
        if(optionalUser.isEmpty())
        {
            throw new UserNotFoundException("User has not Found");
        }
        User user=optionalUser.get();


        Optional<Show> optionalShow=showRepository.findById(showId);
        if(optionalShow.isEmpty())
        {
            throw new ShowNotFoundException("Show not found");
        }

        Show show=optionalShow.get();

        java.util.List<ShowSeat> showSeat=showSeatRepository.findAllById(showSeatIds);

        return  null;

    }
}
