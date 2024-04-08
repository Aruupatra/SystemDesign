package com.example.atm.state;

import com.example.atm.model.ATM;
import com.example.atm.model.Card;

public class CardInsertedState implements state{
    @Override
    public void insertCard(ATM Atm, Card card) {

    }

    @Override
    public void enetrPIN(ATM atm,int pin) {
        if (atm.validatePIN(pin)) {
            atm.setCurrentState(new PINEnteredState());
            atm.displayMessage("Please select transaction type");
        } else {
            atm.displayMessage("Invalid PIN. Please try again.");
        }

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
