package com.example.designpaterns.Factry.NotificationExample;

public class NotificationFactory {

    public static Notification getNotification(NotificationType notificationType,String sender,String recepient,String message)
    {

        switch (notificationType)
        {
            case EMAIL:return new EmailNotification(recepient,sender,message);
            case SMS:return new SmsNotification(recepient,message);
            case PUSH:return new PushNotification(recepient,message);


        }


        return null;
    }
}
