package com.example.designpaterns.BridgeDesignPattern.Implementor;

public class HumanBreathe implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Human can breath");
    }
}