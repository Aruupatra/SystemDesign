package com.example.carbooking.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rider{

    private int rider_id;
    private String name;
    private Location currentLocation;

}
