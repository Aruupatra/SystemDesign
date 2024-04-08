package com.example.designpaterns.BridgeDesignPattern.Implementor;

public class TreeBreathe implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Tree can breath");
    }
}

