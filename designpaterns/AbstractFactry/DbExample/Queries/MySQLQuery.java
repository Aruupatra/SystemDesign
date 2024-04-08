package com.example.designpaterns.AbstractFactry.DbExample.Queries;

public class MySQLQuery implements Query{
    @Override
    public void createQuery() {
        System.out.println("This is MySQLQuery");
    }
}
