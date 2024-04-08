package com.example.machineCoding.Pen;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pen {

    private String name;
    private String brand;
    private int price;

    public Pen(String name, String brand, int price) {
        this.name=name;
        this.brand=brand;
        this.price=price;
    }

    public abstract void write();
    public  abstract void open();
    public abstract void close();


}
