package com.example.designpaterns.Decorator;

import com.example.designpaterns.Decorator.Icecream;

public class Vanila implements Icecream {

    Icecream ic;
    public Vanila(Icecream ic)
    {
        this.ic=ic;
    }
    @Override
    public String getDescription() {
        return ic.getDescription()+"Vanila Cone added";
    }

    @Override
    public int getCost() {
        return ic.getCost()+50;
    }
}
