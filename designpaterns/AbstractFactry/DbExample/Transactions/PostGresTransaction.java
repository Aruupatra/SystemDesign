package com.example.designpaterns.AbstractFactry.DbExample.Transactions;

public class PostGresTransaction implements Transaction{
    @Override
    public void createTransaction() {
        System.out.println("Create MySQL Transaction");
    }
}
