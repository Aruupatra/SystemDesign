package com.example.designpaterns.Strategy;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(String mode)
    {
        if(mode.equals("Bike"))
        {
            return new BikePathCalculator();
        }
        else if(mode.equals("Car"))
        {
            return new CarPathCalculator();
        }
        else if(mode.equals("Bus"))
        {
            return  new BusPathCalculator();
        }
        else {
            return null;
        }
    }
}
