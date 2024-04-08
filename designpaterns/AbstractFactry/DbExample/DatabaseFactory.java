package com.example.designpaterns.AbstractFactry.DbExample;

import com.example.designpaterns.AbstractFactry.DbExample.Queries.Query;
import com.example.designpaterns.AbstractFactry.DbExample.Transactions.Transaction;

public interface DatabaseFactory {


    public Query createQuery();
    public Transaction createTransaction();
}
