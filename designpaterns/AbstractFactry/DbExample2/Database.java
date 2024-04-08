package com.example.designpaterns.AbstractFactry.DbExample2;

import com.example.designpaterns.AbstractFactry.DbExample2.Factories.DBFactory;
import com.example.designpaterns.AbstractFactry.FlutterExample.UIFactory;

public interface Database {

    public void refresh();
    public void setUI();

    public DBFactory getUIFactory();
}
