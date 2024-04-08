package com.example.machineCoding.Pen.FountainPens;

import com.example.machineCoding.Pen.Ink;
import com.example.machineCoding.Pen.Nib;
import com.example.machineCoding.Pen.Pen;

public abstract class FountainPen extends Pen {

    Nib nib;
    Ink ink;

    public FountainPen(String name, String brand, int price,Nib nib,Ink ink) {
        super(name, brand, price);
        this.nib=nib;
        this.ink=ink;
    }
}
