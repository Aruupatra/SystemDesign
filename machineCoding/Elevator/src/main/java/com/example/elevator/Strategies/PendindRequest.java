package com.example.elevator.Strategies;

import com.example.elevator.Direction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class PendindRequest {

    private int destinationFloor;
    private Direction direction;
}
