package com.example.vendingmachine.state;

import com.example.vendingmachine.model.Coin;
import com.example.vendingmachine.model.Item;
import com.example.vendingmachine.model.ItemSelf;
import com.example.vendingmachine.model.VendingMachine;

import java.util.List;

public class SelectionState implements State{
    @Override
    public void insertButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCash(VendingMachine vendingMachine, List<Coin> coins) {

    }

    @Override
    public void selectProductButtoon(VendingMachine vendingMachine,int itemCode, int quantity) {

        int tprice=0;
        for(Coin c:vendingMachine.getCoins())
        {
            tprice=tprice+c.getAmount();
        }
        ItemSelf item=vendingMachine.getArr()[itemCode];



    }

    @Override
    public List<Coin> refundAmount() {
        return null;
    }

    @Override
    public void dispense() {

    }
}
