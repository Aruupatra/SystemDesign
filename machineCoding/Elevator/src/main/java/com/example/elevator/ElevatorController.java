package com.example.elevator;

import com.example.elevator.Strategies.PendindRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElevatorController {

    private int id;
    private ElevatorCar elevatorCar;

    public ElevatorController(int id)
    {
        this.id=id;
        this.elevatorCar=new ElevatorCar(id);
    }

    public void addRequest(int floor,Direction direction)
    {
        ElevatorSystem.elevatorControlStrategies.getRequestQueue().add(new PendindRequest(floor,direction));
        controlCar();
    }

    public void controlCar()
    {
        ElevatorSystem.elevatorControlStrategies.moveElevator(this);

        System.out.println("Elevator is moving");
    }
}
