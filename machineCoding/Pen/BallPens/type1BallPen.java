package com.example.machineCoding.Pen.BallPens;

import com.example.machineCoding.Pen.Refil;

public class type1BallPen extends BallPen{

    public type1BallPen(String name, String brand, int price, Refil refil)
    {
        super(name,brand,price,refil);
    }
    @Override
    public void refil() {
        System.out.println("Type1BallPen refilled");
    }

    @Override
    public void write() {
        System.out.println("Type1BallPen Write");
    }

    @Override
    public void open() {
        System.out.println("Type1BallPen Open");
    }

    @Override
    public void close() {
        System.out.println("Type1BallPen Close");
    }
}
