package com.example.designpaterns.SingleTon;

import lombok.Synchronized;

import javax.xml.crypto.Data;

public class Database {

    static Database obj=null;

    private Database()
    {

    }

    public static Database getInstance()
    {
        if(obj==null)
        {
            synchronized(Database.class)
            {
                if(obj==null)
                {
                    obj=new Database();
                }
            }

        }
        return obj;
    }
}
