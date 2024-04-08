package com.example.designpaterns.CommandDesignPattern.AirCondition;

public class AirCondition {

    boolean light=false;
    public void turnOnAC()
    {
        System.out.println("Turn on the AC");
    }

    public void turnOffAC()
    {
        System.out.println("Turn off the AC");
    }

    public void lightOperation()
    {
        if(light==false)
        {
            System.out.println("light On");
            light=true;
        }
        else {
            System.out.println("light Off");
            light=false;
        }


    }

//    public void lightOffAC()
//    {
//        System.out.println("light Off");
//    }
}
