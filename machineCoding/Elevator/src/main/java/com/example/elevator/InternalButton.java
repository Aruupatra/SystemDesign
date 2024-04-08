package com.example.elevator;

import java.util.ArrayList;
import java.util.List;

public class InternalButton extends Button{

    List<Integer> floors=new ArrayList<>();
    private InternalDispatcher internalDispatcher;
    public InternalButton()
    {
        this.internalDispatcher=new InternalDispatcher();
    }

    public void pressButton(int floor,Direction direction,int elevatorId)
    {
        floors.add(floor);
        System.out.println("Pressed floor "+ floor + " from elevator "+ elevatorId);
        internalDispatcher.submitRequest(floor,direction,elevatorId);
    }
}
