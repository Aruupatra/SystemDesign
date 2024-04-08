package com.example.elevator;

public class ExternalButton extends Button{

    ExternalDispatcher externalDispatcher;
    Direction direction;

    public ExternalButton()
    {
        externalDispatcher=new ExternalDispatcher();
    }
    public void pressButton(int floor,Direction direction)
    {
        this.direction=direction;
        System.out.println("Pressed " + direction + " from floor " + floor);
        externalDispatcher.addRequest(floor,direction);
    }
}
