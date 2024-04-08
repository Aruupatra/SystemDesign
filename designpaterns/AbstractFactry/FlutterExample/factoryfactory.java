package com.example.designpaterns.AbstractFactry.FlutterExample;

public class factoryfactory {

    public static UIFactory getFactory(SupportedPlatforms platform)
    {
        if(platform.equals(SupportedPlatforms.IOS))
        {
            return new IOSFactory();
        }
        else if(platform.equals(SupportedPlatforms.WINDOWS))
        {
            return new WindowsFactory();
        }
        return null;
    }
}
