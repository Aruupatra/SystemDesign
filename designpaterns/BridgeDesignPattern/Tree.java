package com.example.designpaterns.BridgeDesignPattern;

import com.example.designpaterns.BridgeDesignPattern.Implementor.BreatheImplementor;

public class Tree extends Livinghood{

    public Tree(BreatheImplementor breatheImplementor)
    {
        super(breatheImplementor);
    }
    @Override
    public void breathProcess() {

        breatheImplementor.breathe();

    }
}
