package com.example.designpaterns.Decorator;

import com.example.designpaterns.Decorator.Icecream;

public class Chocolate implements Icecream {

    Icecream ic;
    public Chocolate(Icecream ic)
    {
        this.ic=ic;
    }
    @Override
    public String getDescription() {
        return ic.getDescription()+"chocolate added";
    }

    @Override
    public int getCost() {
        return ic.getCost()+15;
    }
}
