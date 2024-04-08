package com.example.elevator;

public class InternalDispatcher {

    public void submitRequest(int floor,Direction direction,int elevatorId)
    {
        for(ElevatorController elevatorController:ElevatorSystem.getAllElevatorControllers())
        {
           if(elevatorController.getId()==elevatorId)
           {
               elevatorController.addRequest(floor,direction);
           }
        }
    }
}
