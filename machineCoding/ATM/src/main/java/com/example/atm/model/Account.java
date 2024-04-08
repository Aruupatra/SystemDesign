package com.example.atm.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    private int accountNumber;
    private String name;
    private String address;
    private double currBalance;
    private Card card;


}
