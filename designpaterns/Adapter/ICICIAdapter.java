package com.example.designpaterns.Adapter;

public class ICICIAdapter implements Adapter{

     ICICI icici=new ICICI();
    @Override
    public void balanceCheck() {
        icici.icicicheckBalance();

    }

    @Override
    public void deposit() {
        icici.icicideposit();

    }

    @Override
    public void withdraw() {
        icici.iciciwithdraw();

    }
}
