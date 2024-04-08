package com.example.atm.state;

import com.example.atm.model.ATM;
import com.example.atm.model.Card;

public class IdealState implements state{
    @Override
    public void insertCard(ATM atm, Card card) {
        atm.setState(new CardInsertedState());
        System.out.print("Card inserted successfully");
        atm.setCard(card);


    }

    @Override
    public void enetrPIN(ATM atm,int pin) {


    }

    @Override
    public void selectTransaction() {

    }

    @Override
    public void completeTransaction() {

    }

    @Override
    public void ejectCard() {

    }
}
