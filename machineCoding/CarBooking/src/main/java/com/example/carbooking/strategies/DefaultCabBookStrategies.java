package com.example.carbooking.strategies;

import com.example.carbooking.module.Cab;

import java.util.List;

public class DefaultCabBookStrategies implements CabBookStrategies{
    @Override
    public Cab getACab(List<Cab> cabs) {
        return cabs.get(0);
    }
}
