package com.example.designpaterns.AbstractFactry.DbExample;

import com.example.designpaterns.Factry.DbExample.MySQL;

public class UserService {

    public static void main(String args[])
    {

        Database database=new Database();
        DatabaseFactory dbf=database.getFactory(SupportedDatabaseTypes.MySQL);
        dbf.createQuery().createQuery();

    }
}
