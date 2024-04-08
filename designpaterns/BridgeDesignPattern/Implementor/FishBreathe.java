package com.example.designpaterns.BridgeDesignPattern.Implementor;

public class FishBreathe implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Fish can breath");
    }
}
