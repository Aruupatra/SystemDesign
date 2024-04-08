package com.example.designpaterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class OrderPlace {

    List<Subscriber> subscribers=new ArrayList<>();

    public void addSubscribers(Subscriber subscriber)
    {
        subscribers.add(subscriber);
    }
    public void NotifyToAll(Bill bill)
    {
        for(Subscriber subscriber:subscribers)
        {
            subscriber.subscribe(bill);
        }
    }
}
