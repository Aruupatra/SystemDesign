package com.example.designpaterns.AbstractFactry.DbExample2;

import com.example.designpaterns.AbstractFactry.DbExample2.Factories.DBFactory;

public class Client {

    public static void main(String[] ar)
    {

        Database db=new MySQL();
        db.refresh();
        db.setUI();
        DBFactory dbf=db.getUIFactory();
        dbf.createQuery().createQuery();
        dbf.createTransaction().createTransaction();
    }
}
