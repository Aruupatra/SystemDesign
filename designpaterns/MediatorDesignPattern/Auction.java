package com.example.designpaterns.MediatorDesignPattern;

import com.example.designpaterns.MediatorDesignPattern.Collegues.Collegue;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AunctionMeditor{

    List<Collegue> collegues=new ArrayList<>();
    @Override
    public void addBider(Collegue bider) {
        collegues.add(bider);

    }

    @Override
    public void placeBid(Collegue bider,int amount) {

        for(Collegue collegue:collegues)
        {
            if(collegue.getName().equals(bider.getName())==false)
            {
                collegue.receivedNotificationByAuction(amount);
            }

        }
    }
}
