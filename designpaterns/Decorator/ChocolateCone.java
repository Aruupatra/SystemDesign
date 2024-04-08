package com.example.designpaterns.Decorator;


import com.example.designpaterns.Decorator.Icecream;

public class ChocolateCone implements Icecream {
    Icecream ic=null;
    public ChocolateCone()
    {

    }
    public ChocolateCone(Icecream ic)
    {
        this.ic=ic;
    }
    @Override
    public String getDescription() {
        if(ic!=null)
        {
           return ic.getDescription()+"Chocolate Cone added ";
        }
        else {
            return "Chocolate Cone added ";
        }
    }

    @Override
    public int getCost() {
        if(ic!=null)
        {
            return ic.getCost()+20;
        }
        else {
            return 20;
        }
    }
}
