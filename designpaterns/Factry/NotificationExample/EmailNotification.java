package com.example.designpaterns.Factry.NotificationExample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EmailNotification extends Notification{

    private String sender;

    public EmailNotification(String recepient,String sender,String message)
    {
        this.recepient=recepient;
        this.sender=sender;
        this.message=message;

    }
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
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
        System.out.println("Email sent to " + recepient+ " from " + sender);
        System.out.println("Message: " + message);
    }
}
