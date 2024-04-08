package com.example.designpaterns.CommandDesignPattern;

import com.example.designpaterns.CommandDesignPattern.AirCondition.AirCondition;
import com.example.designpaterns.CommandDesignPattern.CommandInterface.CommandImplementation;
import com.example.designpaterns.CommandDesignPattern.CommandInterface.LightONOFFCommand;
import com.example.designpaterns.CommandDesignPattern.CommandInterface.TurnOFFCommand;
import com.example.designpaterns.CommandDesignPattern.CommandInterface.TurnONCommand;

public class Client {

    public static void main(String[] ar)
    {
        AirCondition ac=new AirCondition();

        CommandImplementation offswitch=new TurnOFFCommand(ac);
        CommandImplementation onswitch=new TurnONCommand(ac);
        CommandImplementation lightSwitch=new LightONOFFCommand(ac);

        Remote remote=new Remote(offswitch,onswitch,lightSwitch);

        remote.PressOffButton();
        remote.PressOnButton();
        remote.PressLightButton();
        remote.PressLightButton();


    }
}
