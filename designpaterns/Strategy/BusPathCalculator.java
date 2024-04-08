package com.example.designpaterns.Strategy;

public class BusPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String A, String B) {
        System.out.println(A+" Calculate Path to "+B+" via Bus");
    }
}
