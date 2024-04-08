package com.example.bookmyshow2024.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

@Entity(name="screens")
public class Screen extends BaseModel{

    private String name;

    @OneToMany(mappedBy="screen")
    private List<Seat> seats;

    @ElementCollection
    private List<Feature> features;

    @ManyToOne
    private Theatre theatre;
}
