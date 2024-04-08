package com.example.designpaterns.MediatorDesignPattern;

import com.example.designpaterns.MediatorDesignPattern.Collegues.Bider;

public class Client {

    public static void main(String ar[])
    {

        AunctionMeditor aunctionMeditor=new Auction();

        Bider bider1=new Bider("bider1",aunctionMeditor);
        Bider bider2=new Bider("bider2",aunctionMeditor);
        Bider bider3=new Bider("bider3",aunctionMeditor);

        bider1.placeBid(2000);
        bider2.placeBid(3000);

       // bider1.receivedNotificationByAuction(2000);

    }
}
