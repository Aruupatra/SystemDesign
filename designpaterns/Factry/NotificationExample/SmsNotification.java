package com.example.designpaterns.Factry.NotificationExample;

public class SmsNotification extends Notification{




    public SmsNotification(String recepient,String message)
    {
        this.recepient=recepient;
        this.message=message;

    }
    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
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
        // Logic to send an SMS
        System.out.println("SMS sent to " + recepient);
        System.out.println("Message: " + message);
    }
}
