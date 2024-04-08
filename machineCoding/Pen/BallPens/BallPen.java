package com.example.machineCoding.Pen.BallPens;

import com.example.machineCoding.Pen.Interfaces.Refillable;
import com.example.machineCoding.Pen.Pen;
import com.example.machineCoding.Pen.Refil;

public abstract class BallPen extends Pen implements Refillable {

    Refil refil;

    public BallPen(String name, String brand, int price, Refil refil) {
        super(name,brand,price);
        this.refil=refil;
    }
}
