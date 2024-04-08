package com.example.designpaterns.AbstractFactry.FlutterExample.Menu;

public class IOSMenu implements Menu{
    @Override
    public void createMenu() {
        System.out.println("This is IOS Menu");
    }
}
