package com.example.bookmyshow2024.dtos;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookMovieRequestDto {

    private long userId;
    private long showId;
    private List<Long> showSeatIds;
}
