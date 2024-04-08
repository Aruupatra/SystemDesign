package com.example.machineCoding.Pen.GelPens;

import com.example.machineCoding.Pen.Interfaces.Refillable;
import com.example.machineCoding.Pen.Pen;
import com.example.machineCoding.Pen.Refil;

public abstract class GelPen extends Pen implements Refillable {
    Refil refil;

    public GelPen(String name, String brand, int price,Refil refil) {
        super(name, brand, price);
        this.refil=refil;

    }
}
