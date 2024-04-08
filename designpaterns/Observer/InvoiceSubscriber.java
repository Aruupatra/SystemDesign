package com.example.designpaterns.Observer;

public class InvoiceSubscriber implements Subscriber{
    @Override
    public void subscribe(Bill bill) {
        bill.setS(bill.getS()+"Invoice Attached");
    }
}
