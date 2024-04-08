package com.example.designpaterns.Adapter;

public class PhonePay {

    Adapter adapter=new YESAdapter();
    public void BalanceCheck()
    {
        adapter.balanceCheck();
    }

    public void deposit()
    {
        adapter.deposit();
    }
    public void withdraw()
    {
        adapter.withdraw();
    }
}
