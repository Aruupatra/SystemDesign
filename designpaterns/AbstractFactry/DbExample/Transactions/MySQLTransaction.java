package com.example.designpaterns.AbstractFactry.DbExample.Transactions;

public class MySQLTransaction implements Transaction{


    @Override
    public void createTransaction() {
        System.out.println("Create MySQL Transaction");
    }
}
