package com.example.designpaterns.AbstractFactry.DbExample2.Transactions;

public class PostGresTransaction implements Transaction {
    @Override
    public void createTransaction() {
        System.out.println("Create MySQL Transaction");
    }
}
