package com.example.designpaterns.MediatorDesignPattern.Collegues;

import com.example.designpaterns.MediatorDesignPattern.AunctionMeditor;

public class Bider implements Collegue{

    private String name;
   private AunctionMeditor auctionMediator;

    public Bider(String name,AunctionMeditor auctionMediator)
    {
        this.name=name;
        this.auctionMediator=auctionMediator;
        auctionMediator.addBider(this);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receivedNotificationByAuction(int amount) {

        System.out.println("Bider "+name+" get notification for this the amount "+amount);
    }

    @Override
    public void placeBid(int amount) {

        auctionMediator.placeBid(this,amount);

    }
}
