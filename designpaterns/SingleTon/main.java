package com.example.designpaterns.SingleTon;

public class main {

    public static void main(String[] ar)
    {

        Database db=Database.getInstance();
        Database db1=Database.getInstance();

        System.out.println("DEBUG");
    }
}
