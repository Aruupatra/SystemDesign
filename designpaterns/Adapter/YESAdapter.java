package com.example.designpaterns.Adapter;

public class YESAdapter implements Adapter{

    Yes yesbank=new Yes();
    @Override
    public void balanceCheck() {
        yesbank.YescheckBalance();
    }

    @Override
    public void deposit() {
      yesbank.Yesdeposit();
    }

    @Override
    public void withdraw() {
      yesbank.Yeswithdraw();
    }
}
