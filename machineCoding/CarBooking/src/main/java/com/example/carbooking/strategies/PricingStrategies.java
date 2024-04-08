package com.example.carbooking.strategies;

import com.example.carbooking.module.Location;
import org.springframework.cglib.core.Local;

public interface PricingStrategies {

    public int getTotal(Location from, Location to);
}
