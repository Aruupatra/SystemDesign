package com.example.designpaterns.AbstractFactry.DbExample2;

import com.example.designpaterns.AbstractFactry.DbExample2.Factories.DBFactory;
import com.example.designpaterns.AbstractFactry.DbExample2.Factories.MySQLFactory;
import com.example.designpaterns.AbstractFactry.FlutterExample.UIFactory;

public class MySQL implements Database{
    @Override
    public void refresh() {

        System.out.println("MySql refreshed");

    }

    @Override
    public void setUI() {

        System.out.println("UI setUp Completed");

    }

    @Override
    public DBFactory getUIFactory() {
        return new MySQLFactory();
    }
}
