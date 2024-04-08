package com.example.designpaterns.Factry.NotificationExample;

public class Client {

    public static void main(String ar[])
    {
       Notification notification=NotificationFactory.getNotification(NotificationType.EMAIL,"RAM","Arun","Hi Arun");
       notification.sendNotification();

    }
}
