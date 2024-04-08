package com.example.designpaterns.AbstractFactry.DbExample.Queries;

public class PostGresQuery implements Query{
    @Override
    public void createQuery() {

        System.out.println("This is PostGresQuery");
    }
}
