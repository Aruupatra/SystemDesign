package com.example.designpaterns.AbstractFactry.DbExample;

import com.example.designpaterns.AbstractFactry.DbExample.Queries.MySQLQuery;
import com.example.designpaterns.AbstractFactry.DbExample.Queries.Query;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.PostGresTransaction;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.Transaction;

public class MySQLFactory implements DatabaseFactory {


    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new PostGresTransaction();
    }
}
