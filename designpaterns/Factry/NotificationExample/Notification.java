package com.example.designpaterns.Factry.NotificationExample;

public abstract class Notification {

    protected String recepient;
    protected String message;

    public abstract NotificationType notificationType();
    public abstract String getRecipient();
    public abstract String getMessage();
    public abstract void sendNotification();
}


