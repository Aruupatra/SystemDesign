package com.example.designpaterns.FlyWeight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlyBullet {

    private int x;
    private int y;

    private Bullet bullet;
}
