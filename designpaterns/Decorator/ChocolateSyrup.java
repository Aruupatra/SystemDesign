package com.example.designpaterns.Decorator;

import com.example.designpaterns.Decorator.Icecream;

public class ChocolateSyrup implements Icecream {

    Icecream ic;
    public ChocolateSyrup(Icecream ic)
    {
        this.ic=ic;
    }
    @Override
    public String getDescription() {
        return ic.getDescription()+"CgocolateSyrup Added";
    }

    @Override
    public int getCost() {
        return ic.getCost()+22;
    }
}
