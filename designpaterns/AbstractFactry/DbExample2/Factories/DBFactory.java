package com.example.designpaterns.AbstractFactry.DbExample2.Factories;

import com.example.designpaterns.AbstractFactry.DbExample.Queries.Query;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.Transaction;

public interface DBFactory {

    public Query createQuery();
    public Transaction createTransaction();
}
