package com.example.designpaterns.Composite;

import com.example.designpaterns.Composite.Components.Composite;
import com.example.designpaterns.Composite.Components.Leaf;

public class Client {

    public static void main(String ar[])
    {

        Leaf screen=new Leaf("Screen",2000);
        Leaf mouse=new Leaf("Mouse",1000);
        Leaf speaker=new Leaf("Speaker",500);

        Composite moniter=new Composite("Moniter");
        moniter.addComponent(screen);
        moniter.addComponent(mouse);
        moniter.addComponent(speaker);

        Leaf oil=new Leaf("Oil",10);
        Leaf cell=new Leaf("Cell",25);

        Composite battery=new Composite("Battery");
        battery.addComponent(oil);
        battery.addComponent(cell);

        Leaf hdmi=new Leaf("Hdmi",5);

        Composite cpu=new Composite("Cpu");
        cpu.addComponent(battery);
        cpu.addComponent(hdmi);

        Composite computer=new Composite("Computer");
        computer.addComponent(moniter);
        computer.addComponent(cpu);

        computer.showPrice();

        System.out.println("DEBUG");




    }
}
