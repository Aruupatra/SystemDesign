package com.example.bookmyshow2024.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

import java.util.Date;

@Getter
@Setter

@Entity(name="shows")
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Screen screen;

    @ElementCollection
    private List<Feature> features;


}
