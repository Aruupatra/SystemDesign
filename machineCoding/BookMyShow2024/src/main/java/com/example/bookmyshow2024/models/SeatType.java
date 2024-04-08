package com.example.bookmyshow2024.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="seat_types")
public class SeatType extends BaseModel{

    private String name;


}
