package com.example.designpaterns.Factry.NotificationExample;

public class PushNotification extends Notification{




    public PushNotification(String recepient,String message)
    {
        this.recepient=recepient;
        this.message=message;

    }
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public String getRecipient() {
        return recepient;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void sendNotification() {
        System.out.println("Push notification sent to device " + recepient);
        System.out.println("Message: " + message);
    }
}
