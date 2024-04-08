package com.example.elevator.Strategies;

import com.example.elevator.Direction;
import com.example.elevator.ElevatorCar;
import com.example.elevator.ElevatorController;
import com.example.elevator.ElevatorSystem;

import java.util.Date;
import java.util.List;

public abstract class ElevatorSelectionStrategy {

    private List<ElevatorController>  elevatorControllers= ElevatorSystem.getAllElevatorControllers();
    public abstract int selectElevator(int floor, Direction direction);
}
