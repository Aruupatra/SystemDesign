package com.example.designpaterns.AbstractFactry.DbExample;

public class factoryfactory {


    public static DatabaseFactory getFactory(SupportedDatabaseTypes supportedDatabaseTypes)
    {
        if(supportedDatabaseTypes.equals(SupportedDatabaseTypes.MySQL))
        {
            return new MySQLFactory();
        }
        else {
            return new PostGresFactory();
        }
    }
}
