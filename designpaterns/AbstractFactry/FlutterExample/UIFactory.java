package com.example.designpaterns.AbstractFactry.FlutterExample;

import com.example.designpaterns.AbstractFactry.FlutterExample.Button.Button;
import com.example.designpaterns.AbstractFactry.FlutterExample.Menu.Menu;

public interface UIFactory {

    public Button createButton();
    public Menu createMenu();
}
