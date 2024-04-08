package com.example.designpaterns.Adapter;

public class client {

    public static  void main(String[] ar)
    {
        PhonePay pay=new PhonePay();
        pay.BalanceCheck();
        pay.deposit();
        pay.withdraw();
    }
}
