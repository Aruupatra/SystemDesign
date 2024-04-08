package com.example.designpaterns.AbstractFactry.DbExample;

public class Database {

    public void refreshUI()
    {
        System.out.println("Refresh Done");
    }

    public void settheme()
    {
        System.out.println("SET theme Completed");
    }

    public DatabaseFactory getFactory(SupportedDatabaseTypes supportedDatabaseTypes)
    {
        return factoryfactory.getFactory(supportedDatabaseTypes);
    }
}
