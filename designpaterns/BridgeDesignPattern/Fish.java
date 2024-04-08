package com.example.designpaterns.BridgeDesignPattern;

import com.example.designpaterns.BridgeDesignPattern.Implementor.BreatheImplementor;

public class Fish extends Livinghood{

    public Fish(BreatheImplementor breatheImplementor)
    {
        super(breatheImplementor);
    }
    @Override
    public void breathProcess() {

        breatheImplementor.breathe();

    }
}
