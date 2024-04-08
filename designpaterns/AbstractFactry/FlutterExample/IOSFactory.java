package com.example.designpaterns.AbstractFactry.FlutterExample;

import com.example.designpaterns.AbstractFactry.FlutterExample.Button.Button;
import com.example.designpaterns.AbstractFactry.FlutterExample.Button.IOSButton;
import com.example.designpaterns.AbstractFactry.FlutterExample.Menu.IOSMenu;
import com.example.designpaterns.AbstractFactry.FlutterExample.Menu.Menu;
import com.example.designpaterns.AbstractFactry.FlutterExample.UIFactory;

public class IOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
