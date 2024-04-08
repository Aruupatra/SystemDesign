package com.example.designpaterns.CommandDesignPattern;

import com.example.designpaterns.CommandDesignPattern.CommandInterface.CommandImplementation;

public class Remote {

    CommandImplementation off;
    CommandImplementation on;
    CommandImplementation light;

    public Remote(CommandImplementation off,CommandImplementation on,CommandImplementation light)
    {
        this.off=off;
        this.on=on;
        this.light=light;
    }

    public void PressOffButton()
    {
        off.execute();
    }
    public void PressOnButton()
    {
        on.execute();
    }

    public void PressLightButton()
    {
        light.execute();
    }
}
