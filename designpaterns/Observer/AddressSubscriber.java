package com.example.designpaterns.Observer;

public class AddressSubscriber implements Subscriber{
    @Override
    public void subscribe(Bill bill) {
        bill.setS(bill.getS()+"Address Attached");
    }
}
