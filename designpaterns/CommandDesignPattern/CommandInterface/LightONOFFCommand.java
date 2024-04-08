package com.example.designpaterns.CommandDesignPattern.CommandInterface;


import com.example.designpaterns.CommandDesignPattern.AirCondition.AirCondition;

public class LightONOFFCommand implements CommandImplementation{

    AirCondition ac;
   public LightONOFFCommand(AirCondition ac)
    {
        this.ac=ac;
    }
    @Override
    public void execute() {
     ac.lightOperation();
    }
}
