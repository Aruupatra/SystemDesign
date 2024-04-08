package com.example.designpaterns.AbstractFactry.FlutterExample;

import com.example.designpaterns.AbstractFactry.FlutterExample.Button.Button;
import com.example.designpaterns.AbstractFactry.FlutterExample.Button.WindowsButton;
import com.example.designpaterns.AbstractFactry.FlutterExample.Menu.Menu;
import com.example.designpaterns.AbstractFactry.FlutterExample.Menu.WindowsMenu;

public class WindowsFactory implements UIFactory{


    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
