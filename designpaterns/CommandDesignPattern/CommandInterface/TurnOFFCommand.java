package com.example.designpaterns.CommandDesignPattern.CommandInterface;

import com.example.designpaterns.CommandDesignPattern.AirCondition.AirCondition;

public class TurnOFFCommand implements CommandImplementation{
    AirCondition ac;

    public TurnOFFCommand(AirCondition ac)
    {
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.turnOffAC();
    }
}
