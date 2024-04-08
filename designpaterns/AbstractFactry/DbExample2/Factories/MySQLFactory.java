package com.example.designpaterns.AbstractFactry.DbExample2.Factories;

import com.example.designpaterns.AbstractFactry.DbExample.Queries.MySQLQuery;
import com.example.designpaterns.AbstractFactry.DbExample.Queries.Query;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.MySQLTransaction;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.Transaction;

public class MySQLFactory implements DBFactory{
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MySQLTransaction();
    }
}
