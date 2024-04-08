package com.example.machineCoding.SnakeandLadder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    public Player(String name)
    {
        this.name=name;
    }
    private String name;
    private int Position;
    private boolean isWon;

}
