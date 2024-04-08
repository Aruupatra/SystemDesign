package com.example.designpaterns.AbstractFactry.DbExample2.Factories;

import com.example.designpaterns.AbstractFactry.DbExample.Queries.PostGresQuery;
import com.example.designpaterns.AbstractFactry.DbExample.Queries.Query;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.MySQLTransaction;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.PostGresTransaction;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.Transaction;

public class PostGresFactory implements DBFactory{
    @Override
    public Query createQuery() {
        return new PostGresQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new PostGresTransaction();
    }
}
