package com.example.designpaterns.AbstractFactry.DbExample2.Queries;

public class PostGresQuery implements Query {
    @Override
    public void createQuery() {

        System.out.println("This is PostGresQuery");
    }
}
