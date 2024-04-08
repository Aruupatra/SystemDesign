package com.example.atm.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Card {

    private int cardNumber;
    private Date expiryDate;
    private String name;
    private int pin;

}
