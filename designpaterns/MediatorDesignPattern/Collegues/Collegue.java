package com.example.designpaterns.MediatorDesignPattern.Collegues;

public interface Collegue {

    public String getName();
    public void receivedNotificationByAuction(int amount);
    public void placeBid(int amount);
}
