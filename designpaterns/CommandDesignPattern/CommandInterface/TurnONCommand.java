package com.example.designpaterns.CommandDesignPattern.CommandInterface;

import com.example.designpaterns.CommandDesignPattern.AirCondition.AirCondition;

public class TurnONCommand implements CommandImplementation{
    AirCondition ac;

    public TurnONCommand(AirCondition ac)
    {
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }
}
