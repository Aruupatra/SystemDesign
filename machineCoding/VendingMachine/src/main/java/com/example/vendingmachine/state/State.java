package com.example.vendingmachine.state;

import com.example.vendingmachine.model.Coin;
import com.example.vendingmachine.model.VendingMachine;

import java.util.List;

public interface State {


    public void insertButton(VendingMachine vendingMachine) throws Exception;
    public void insertCash(VendingMachine vendingMachine,List<Coin> coins) throws Exception;
    public void selectProductButtoon(VendingMachine vendingMachine,int itemCode,int quantity) throws Exception;
    public List<Coin> refundAmount() throws Exception;
    public void dispense() throws Exception;

}
