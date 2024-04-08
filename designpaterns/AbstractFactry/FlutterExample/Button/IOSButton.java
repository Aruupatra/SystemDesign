package com.example.designpaterns.AbstractFactry.FlutterExample.Button;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("This is IOS Button");
    }
}
