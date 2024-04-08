package com.example.atm.model;

import com.example.atm.state.state;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ATM {


    private int ATM_id;
    private String location;
    private Bank bank;
    private state state;
    private Card card;


    public boolean validatePin(ATM atm,int pin)
    {

    }
}
