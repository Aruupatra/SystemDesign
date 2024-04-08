package com.example.designpaterns.AbstractFactry.DbExample2;

import com.example.designpaterns.AbstractFactry.DbExample2.Factories.DBFactory;
import com.example.designpaterns.AbstractFactry.DbExample2.Factories.MySQLFactory;
import com.example.designpaterns.AbstractFactry.DbExample2.Factories.PostGresFactory;

public class PostGres implements Database{
    @Override
    public void refresh() {

        System.out.println("PostGres refreshed");

    }

    @Override
    public void setUI() {

        System.out.println("PostGres UI setUp Completed");

    }

    @Override
    public DBFactory getUIFactory() {
        return new PostGresFactory();
    }
}
