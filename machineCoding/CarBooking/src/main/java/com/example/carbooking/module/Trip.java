package com.example.carbooking.module;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trip {

    private int trip_id;
    private int cab_id;
    private int rider_id;
    private Location from;
    private Location to;
    private TripStatus tripStatus;

}
