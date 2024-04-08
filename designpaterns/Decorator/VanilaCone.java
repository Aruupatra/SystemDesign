package com.example.designpaterns.Decorator;


import com.example.designpaterns.Decorator.Icecream;

public class VanilaCone implements Icecream {

    Icecream ic=null;

    public VanilaCone()
    {

    }
    public VanilaCone(Icecream ic)
    {
        this.ic=ic;
    }
    @Override
    public String getDescription() {
        if(ic!=null)
        {
            return ic.getDescription()+"Vanila Cone added ";
        }
        else {
            return "Vanila Cone added ";
        }
    }

    @Override
    public int getCost() {
        if(ic!=null)
        {
            return ic.getCost()+10;
        }
        else {
            return 10;
        }
    }
}
