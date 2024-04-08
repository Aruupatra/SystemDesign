package com.example.designpaterns.FlyWeight;

public class client {

    public static void main(String[] ar)
    {
        Bullet bullet=new Bullet();
        FlyBullet obj1=new FlyBullet();
        obj1.setX(0);
        obj1.setY(1);
        obj1.setBullet(bullet);

        FlyBullet obj2=new FlyBullet();
        obj2.setX(0);
        obj2.setY(0);
        obj2.setBullet(bullet);

        System.out.println("DEBUG");


    }
}
