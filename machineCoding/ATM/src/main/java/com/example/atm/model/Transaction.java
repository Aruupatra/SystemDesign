package com.example.atm.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Transaction {

    private int id;
    private TransactionType transactionType;
    private double amount;
    private Date date;
    private TransactionStatus transactionStatus;

}
