package com.example.designpaterns.BridgeDesignPattern;

import com.example.designpaterns.BridgeDesignPattern.Implementor.BreatheImplementor;

public class Human extends Livinghood{

    public Human(BreatheImplementor breatheImplementor)
    {
        super(breatheImplementor);
    }
    @Override
    public void breathProcess() {

        breatheImplementor.breathe();

    }
}
