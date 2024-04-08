package com.example.vendingmachine.state;

import com.example.vendingmachine.model.Coin;
import com.example.vendingmachine.model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class HashMoneyState implements State{
    @Override
    public void insertButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You can't do this operartion now");

    }

    @Override
    public void insertCash(VendingMachine vendingMachine,List<Coin> coins) {

        vendingMachine.setCoins(new ArrayList<>(coins));
        System.out.println("Cash inserted Successfully,please select the product");
        vendingMachine.setState(new SelectionState());
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
