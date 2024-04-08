package com.example.designpaterns.AbstractFactry.FlutterExample;

public class client {

    public static void main(String ar[])
    {

        Flutter flutter=new Flutter();
        flutter.refreshUI();
        flutter.settheme();
        UIFactory factory=flutter.getFactory(SupportedPlatforms.WINDOWS);

        factory.createButton().click();
        factory.createMenu().createMenu();

    }
}
