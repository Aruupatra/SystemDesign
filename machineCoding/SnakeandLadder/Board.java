package com.example.machineCoding.SnakeandLadder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {

    int size;
    int start;
    int end;

    public Board(int size)
    {
        this.size=size;
        this.start=1;
        this.end=this.start+this.size-1;
    }
}
