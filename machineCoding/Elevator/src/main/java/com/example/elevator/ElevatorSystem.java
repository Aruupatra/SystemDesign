package com.example.elevator;

import com.example.elevator.Strategies.ElevatorControlStrategies;
import com.example.elevator.Strategies.ElevatorSelectionStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ElevatorSystem {

    private static List<ElevatorController> elevatorControllers=new ArrayList<>();
    public static ElevatorControlStrategies elevatorControlStrategies;
    public static ElevatorSelectionStrategy elevatorSelectionStrategy;
    public List<Floor> floors=new ArrayList<>();
    public static List<ElevatorController> getAllElevatorControllers()
    {
        return elevatorControllers;
    }

    public void addElevator(ElevatorController elevatorController)
    {
        elevatorControllers.add(elevatorController);
    }
    public void removeElevator(ElevatorController elevatorController)
    {
        elevatorControllers.remove(elevatorController);
    }

    public void setElevatorControlStrategies(ElevatorControlStrategies elevatorControlStrategies)
    {
        elevatorControlStrategies=elevatorControlStrategies;
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy)
    {
        elevatorSelectionStrategy=elevatorSelectionStrategy;
    }

    public void addFloors(Floor floor)
    {
      floors.add(floor);
    }

}
