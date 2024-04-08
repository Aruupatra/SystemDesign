package com.example.designpaterns.Observer;

public class GSTSubscriber implements Subscriber{
    @Override
    public void subscribe(Bill bill) {
        bill.setS(bill.getS()+"GST Attached");
    }
}
