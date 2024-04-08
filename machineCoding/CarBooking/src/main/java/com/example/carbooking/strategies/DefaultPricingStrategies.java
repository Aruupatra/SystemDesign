package com.example.carbooking.strategies;

import com.example.carbooking.module.Location;

public class DefaultPricingStrategies implements PricingStrategies{
    @Override
    public int getTotal(Location from, Location to) {

        return 55*10;
    }
}
