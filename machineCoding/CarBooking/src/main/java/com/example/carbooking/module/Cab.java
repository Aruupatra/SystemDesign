package com.example.carbooking.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Cab {

    private int cab_id;
    private int driver_id;
    private Location currlocation;
    private CabStatus cabStatus;

    public int distance(Location location)
    {
        return (int)(Math.sqrt((location.getX()-currlocation.getX())+(location.getX()-currlocation.getX())));
    }


}
