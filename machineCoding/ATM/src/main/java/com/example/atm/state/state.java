package com.example.atm.state;

import com.example.atm.model.ATM;
import com.example.atm.model.Card;

public interface state {

    public void insertCard(ATM Atm, Card card);
    public void enetrPIN(ATM atm,int pin);
    public void selectTransaction();
    public void completeTransaction();
    public void ejectCard();

}
