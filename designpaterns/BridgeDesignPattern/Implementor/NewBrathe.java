package com.example.designpaterns.BridgeDesignPattern.Implementor;

public class NewBrathe implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("New brathe added");
    }
}
