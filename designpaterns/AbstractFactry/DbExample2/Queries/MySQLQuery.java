package com.example.designpaterns.AbstractFactry.DbExample2.Queries;

public class MySQLQuery implements Query {
    @Override
    public void createQuery() {
        System.out.println("This is MySQLQuery");
    }
}
