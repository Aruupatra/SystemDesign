package com.example.elevator;

import com.example.elevator.Strategies.ElevatorSelectionStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExternalDispatcher {

    private ElevatorSelectionStrategy elevatorSelectionStrategy=ElevatorSystem.elevatorSelectionStrategy;

    public void addRequest(int floor,Direction direction){
        int elevatorId=elevatorSelectionStrategy.selectElevator(floor,direction);

        for(ElevatorController elevatorController:ElevatorSystem.getAllElevatorControllers())
        {
            if(elevatorController.getId()==elevatorId)
            {
                elevatorController.addRequest(floor,direction);
            }
        }

    }



}
