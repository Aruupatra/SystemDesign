package com.example.designpaterns.Factry.DbExample;

public interface Database {
    public Query createQuery();


    public Transaction createTransaction();
}
