package com.example.designpaterns.AbstractFactry.FlutterExample;

public class Flutter {

    public void refreshUI()
    {
        System.out.println("Refresh Done");
    }

    public void settheme()
    {
        System.out.println("SET theme Completed");
    }

    public UIFactory getFactory(SupportedPlatforms platform)
    {
        return factoryfactory.getFactory(platform);
    }
}
