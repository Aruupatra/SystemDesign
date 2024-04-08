package com.example.elevator.Strategies;

import com.example.elevator.ElevatorController;
import com.example.elevator.ElevatorSystem;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
@Getter
@Setter

public abstract class ElevatorControlStrategies {

    Queue<PendindRequest> requestQueue=new LinkedList<>();
    List<ElevatorController> elevatorControllers= ElevatorSystem.getAllElevatorControllers();

    public abstract void moveElevator(ElevatorController elevatorController);

}
