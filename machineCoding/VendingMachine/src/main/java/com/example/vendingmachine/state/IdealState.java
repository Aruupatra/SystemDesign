package com.example.vendingmachine.state;

import com.example.vendingmachine.model.Coin;
import com.example.vendingmachine.model.VendingMachine;

import java.util.List;

public class IdealState implements State{

    public IdealState()
    {
        System.out.println("Hey Machine is in Ideal State");
    }
    @Override
    public void insertButton(VendingMachine vendingMachine) {

        System.out.println("Please Insert Cash");
        vendingMachine.setState(new HashMoneyState());

    }

    @Override
    public void insertCash(VendingMachine vendingMachine,List<Coin> coins) throws Exception {
        throw new Exception("You can't do this operartion now");

    }

    @Override
    public void selectProductButtoon(VendingMachine vendingMachine,int itemCode, int quantity) throws Exception {
        throw new Exception("You can't do this operartion now");

    }

    @Override
    public List<Coin> refundAmount() throws Exception {
        throw new Exception("You can't do this operartion now");
    }

    @Override
    public void dispense() throws Exception {
        throw new Exception("You can't do this operartion now");
    }
}
