package com.example.designpaterns.AbstractFactry.FlutterExample.Button;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("This is Windows Button");
    }
}
