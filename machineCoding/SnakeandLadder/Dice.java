package com.example.machineCoding.SnakeandLadder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
public class Dice {

    private int min;
    private int max;
    private int curr;

    public int roll()
    {
        Random random=new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
