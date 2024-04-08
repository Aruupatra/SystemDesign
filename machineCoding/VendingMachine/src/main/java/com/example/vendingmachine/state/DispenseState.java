package com.example.vendingmachine.state;

import com.example.vendingmachine.model.Coin;
import com.example.vendingmachine.model.VendingMachine;

import java.util.List;

public class DispenseState implements State{
    @Override
    public void insertButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCash(VendingMachine vendingMachine, List<Coin> coins) {

    }

    @Override
    public void selectProductButtoon(VendingMachine vendingMachine,int itemCode, int quantity) {

    }

    @Override
    public List<Coin> refundAmount() {
        return null;
    }

    @Override
    public void dispense() {

    }
}
