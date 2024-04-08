package com.example.designpaterns.BridgeDesignPattern;

import com.example.designpaterns.BridgeDesignPattern.Implementor.BreatheImplementor;

public abstract class Livinghood {

    BreatheImplementor breatheImplementor;

    public Livinghood(BreatheImplementor breatheImplementor) {
        this.breatheImplementor=breatheImplementor;
    }

    public abstract void breathProcess();
}
