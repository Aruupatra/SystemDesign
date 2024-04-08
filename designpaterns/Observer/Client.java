package com.example.designpaterns.Observer;

public class Client {
    public static void main(String[] ar)
    {
        Bill bill=new Bill();
        OrderPlace orderPlace=new OrderPlace();
        orderPlace.addSubscribers(new InvoiceSubscriber());
        orderPlace.addSubscribers(new GSTSubscriber());
        orderPlace.addSubscribers(new AddressSubscriber());

        orderPlace.NotifyToAll(bill);
        System.out.println(bill.getS());

        System.out.println("DEBUG");

    }
}
